package com.wang.service;

import com.wang.dao.UserDao;

public class UserServiceImpl implements UserService {
//    传统方式实现
   /* private UserDao userDao = new UserDaoImpl();
    private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao = new UserDaoOracleImpl();*/
   private UserDao userDao;

//   利用set动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();

    }
}
