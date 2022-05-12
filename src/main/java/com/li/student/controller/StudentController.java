package com.li.student.controller;

import com.li.student.pojo.Teacher;
import com.li.student.pojo.Student;
import com.li.student.pojo.User;
import com.li.student.scrvice.TeacherService;
import com.li.student.scrvice.StudentService;
import com.li.student.scrvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author li
 * @create 2022-05-04-10:24
 */
@Controller
public class StudentController {

    @Autowired
    private UserService userservice;
    @Autowired
    private StudentService studentservice;

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/tologin")
    public String tologin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession session) {

        boolean us = userservice.login(user);

        if (us == true) {
            session.setAttribute("loginUser",user);
            //查询所有学生
            List<Student> students = studentservice.findList();
            model.addAttribute("students", students);
            return "home";
        }
        return "index";
    }

    @RequestMapping("/toregister")
    public String toregister() {
        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {
        userservice.addUser(user);
        return "index";
    }

    //添加学生
    @PostMapping("/add")
    public String addStudent(Student student){
        //添加
        studentservice.addStudent(student);
        return "redirect:/home.html";
    }

    @GetMapping("/home.html")
    public String homePage(Model model){
        //查询所有学生
        List<Student> students = studentservice.findList();
        model.addAttribute("students", students);
        return "home";
    }

    @RequestMapping("/huixian/{id}")
    public String getStudentById(@PathVariable("id") Integer id, Model model){
        Student student = studentservice.getStudentById(id);
        model.addAttribute("student",student);
        return "edit";
    }

    @RequestMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable("id") Integer id, Model model){
        studentservice.deleteStudentById(id);
        return "redirect:/home.html";
    }

    @RequestMapping("/edit")
    public String editStudentById(Student student){

        studentservice.editStudentById(student);
        return "redirect:/home.html";
    }

    @RequestMapping("/banji")
    public String banji(Model model){
        List<Teacher> teacherList = teacherService.getClassesAndStudent();
        model.addAttribute("classesList", teacherList);
        return "teacher";
    }

    @RequestMapping("/fanhui")
    public String fanhui(){
        return "redirect:/home.html";
    }

    @RequestMapping("/query/{name}")
    public String StudentId(@PathVariable("name") String name,Model model){
        List<Student> students = studentservice.queryStudentByName(name);

        if (students.size() != 0){
            model.addAttribute("students",students);
            return "query";
        }
        return "redirect:/home.html";
    }


}
