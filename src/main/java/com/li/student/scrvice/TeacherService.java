package com.li.student.scrvice;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.student.pojo.Teacher;

import java.util.List;

/**
 * @author li
 * @create 2022-05-06-17:57
 */
public interface TeacherService extends IService<Teacher> {

    /**
     * 多表联查
     * @return
     */
    List<Teacher> getTeachersAndStudent();

}
