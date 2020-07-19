package com.login.service.Impl;
/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 21:01
 * Description:
 * Others:
 */

import com.login.dao.UserDao;
import com.login.domain.User;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String selectByUserName(User user) {
        String userName = user.getUsername();
        String password = user.getPassword();
        User users = userDao.selectByUserName(userName, password);
        if (users == null){
            return "No";
        }
        return "Yes";
    }
}
