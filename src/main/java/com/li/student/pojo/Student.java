package com.li.student.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author li
 * @create 2022-05-04-14:04
 */
@Data
public class Student {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String classid;

    private int money;


}
