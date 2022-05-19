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
    /**
     * 查询所有学生
     * @return
     */
    List<Student> findList();

    /**
     * 添加学生
     * @param student
     */
    void addStudent(Student student);

    /**
     * 通过id获取学生信息
     * @param id
     * @return
     */
    Student getStudentById(Integer id);

    /**
     * 通过id删除学生信息
     * @param id
     */
    void deleteStudentById(Integer id);

    /**
     * 修改信息
     * @param student
     */
    void editStudentById(Student student);

    /**
     * 根据name进行查询
     * @param name
     * @return
     */
    List<Student> queryStudentByName(String name);
}
