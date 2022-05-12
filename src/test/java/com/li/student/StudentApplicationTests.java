package com.li.student;

import com.li.student.mapper.TeacherMapper;
import com.li.student.mapper.StudentMapper;
import com.li.student.mapper.UserMapper;
import com.li.student.pojo.Teacher;
import com.li.student.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    void contextLoads() {
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void add(){
        Student student = new Student();
        student.setAge(12);
        student.setName("理理理理");
        student.setSex("男");
        studentMapper.insert(student);
    }

    @Test
    void select(){
        Student student = studentMapper.selectById(2080444422);
        System.out.println(student);
    }


    @Test
    void selectClassesAndStudent(){
        List<Teacher> teacherList = teacherMapper.getClassesAndStudent();
        teacherList.forEach(classes -> System.out.println(classes));
        System.out.println(teacherList.get(0).getStudents().get(1).getName());
    }




}
