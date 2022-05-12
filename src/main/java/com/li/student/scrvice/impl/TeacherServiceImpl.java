package com.li.student.scrvice.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.student.mapper.TeacherMapper;
import com.li.student.pojo.Teacher;
import com.li.student.scrvice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author li
 * @create 2022-05-06-17:57
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getClassesAndStudent() {
        List<Teacher> teacherList = teacherMapper.getClassesAndStudent();
        return teacherList;
    }
}
