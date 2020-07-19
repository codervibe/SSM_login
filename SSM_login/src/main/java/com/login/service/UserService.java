package com.login.service;

/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 21:00
 * Description:
 * Others:
 */

import com.login.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service("userService")
public interface UserService {

    /**
     * @param user
     * @return
     */
    public String selectByUserName(User user);
}
