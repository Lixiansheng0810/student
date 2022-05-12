package com.li.student.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author li
 * @create 2022-05-06-16:22
 */
@Data
public class Teacher {
    private Integer id;

    private String teachername;

    private List<Student> students;
}
