package com.login.web.controller;

import com.login.domain.User;
import com.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 20:55
 * Description:
 * Others:
 */

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model) {
        System.out.println("有人来了.......");
        System.out.println("登录方法执行了....");
        System.out.println("username = " + user.getUsername());
        System.out.println("password = " + user.getPassword());
        String Info = userService.selectByUserName(user);
        model.addAttribute("user",user);
        System.out.println("Info = " + Info);
        if ("Yes".equals(Info)) {
            return "Success";

        } else {
            return "fail";
        }

    }

    @RequestMapping("/show")
    public void show() {
        System.out.println("show 方法执行了......");
    }
}
