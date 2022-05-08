package patterns.structural.proxy.dao.proxy;

import patterns.structural.proxy.dao.IUserDao;
import patterns.structural.proxy.dao.UserDao;
import patterns.structural.proxy.dao.proxy.annotations.RequestProxy;
import patterns.structural.proxy.domain.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.stream.Stream;

public class UserDaoProxy {

    public UserDaoProxy() {
        super();
    }

    public IUserDao createUserDaoProxy(IUserDao userDAO) {
        return (IUserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(), new Class<?>[]{
                IUserDao.class
        }, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(needProxy(method)) {
                    return proxyMethod(proxy, method, args);
                } else {
                    return method.invoke(userDAO, args);
                }
            }
            private boolean needProxy(Method method) {
                try {
                    Method userDaoMethod = userDAO.getClass().getMethod(method.getName(), method.getParameterTypes());
                    return Stream.of(userDaoMethod.getAnnotations()).anyMatch(annotation -> annotation.annotationType().equals(RequestProxy.class));
                } catch (NoSuchMethodException | SecurityException ex) {
                    throw new RuntimeException();
                }
            }

            private Object proxyMethod(Object proxy, Method method, Object[] args) {
                try {
                    String stringUser = (String) method.invoke(userDAO, args);
                    User user = new User();
                    user.setId((Long) args[0]);
                    user.setName(stringUser.substring(stringUser.indexOf("name='"), stringUser.indexOf("',")));
                    user.setPassword("***");
                    return user.toString();
                } catch (InvocationTargetException | IllegalAccessException e) {
                    throw new RuntimeException();
                }
            }
        });
    }
}
