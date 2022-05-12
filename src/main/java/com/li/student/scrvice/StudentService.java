package com.li.student.scrvice;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.li.student.pojo.Student;

import java.util.List;

/**
 * @author li
 * @create 2022-05-04-14:14
 */
public interface StudentService extends IService<Student> {
    List<Student> findList();

    void addStudent(Student student);

    Student getStudentById(Integer id);

    void deleteStudentById(Integer id);

    void editStudentById(Student student);

    /**
     * 根据name进行查询
     * @param name
     * @return
     */
    List<Student> queryStudentByName(String name);
}
