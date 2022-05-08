package patterns.structural.proxy.dao;

import patterns.structural.proxy.domain.User;

public interface IUserDao {

    User saveUser(User user);
    String getListOfUsers();
    String getUserById(long id);

}
