package com.li.student.scrvice.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.student.mapper.StudentMapper;
import com.li.student.pojo.Student;
import com.li.student.scrvice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author li
 * @create 2022-05-04-14:15
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findList() {
        List<Student> students = studentMapper.selectList(null);
        return students;
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);

    }

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.selectById(id);
        return student;
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentMapper.deleteById(id);
    }

    @Override
    public void editStudentById(Student student) {
        studentMapper.updateById(student);
    }


    @Override
    public List<Student> queryStudentByName(String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        List<Student> students = studentMapper.selectByMap(map);
        return students;
    }

}
