package com.login.dao;

/*
 * Created by Administrator on 2020/7/18  0018
 * DateTime:2020/07/18 21:00
 * Description:
 * Others:
 */

import com.login.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 */
@Component
@Repository
public interface UserDao {


    /**
     * @param userName
     * @param password
     * @return
     */
    @Select("select username,password from user where username=#{username} and password=#{password}")
    public User selectByUserName(@Param("username") String userName,@Param("password") String password);
}
