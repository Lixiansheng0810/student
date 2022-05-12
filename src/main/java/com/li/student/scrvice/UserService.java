package com.li.student.scrvice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.student.pojo.Student;
import com.li.student.pojo.User;

import java.util.List;

/**
 * @author li
 * @create 2022-05-04-12:49
 */
public interface UserService extends IService<User> {
    boolean login(User user);

    void addUser(User user);

}
