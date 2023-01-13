package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userService = new UserDaoHibernateImpl();
        userService.createUsersTable();
        userService.saveUser("name1", "surname1", (byte) 39);
        userService.saveUser("name2", "surname2", (byte) 43);
        userService.saveUser("name3", "surname3", (byte) 39);
        userService.saveUser("name4", "surname4", (byte) 51);
        System.out.println();
        System.out.print(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}