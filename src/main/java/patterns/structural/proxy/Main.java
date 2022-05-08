package patterns.structural.proxy;

import patterns.structural.proxy.dao.IUserDao;
import patterns.structural.proxy.dao.UserDao;
import patterns.structural.proxy.dao.proxy.UserDaoProxy;
import patterns.structural.proxy.domain.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", "qwerty123");
        User user2 = new User("Jane Doe", "0123456789");

        IUserDao complicatedUserDao = new UserDaoProxy().createUserDaoProxy(new UserDao());

        complicatedUserDao.saveUser(user);
        complicatedUserDao.saveUser(user2);
    }
}
