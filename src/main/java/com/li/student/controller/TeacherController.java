package com.li.student.controller;

import com.li.student.Result;
import com.li.student.pojo.Teacher;
import com.li.student.scrvice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author li
 * @create 2022-05-08-12:22
 */
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping("/jiaoshi")
    public Result banji(){
        List<Teacher> teacherList = teacherService.getClassesAndStudent();
//        model.addAttribute("classesList",classesList);
        return Result.success(teacherList);
    }

}
