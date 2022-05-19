package com.li.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.li.student.pojo.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author li
 * @create 2022-05-06-17:56
 */
@Repository
public interface TeacherMapper extends BaseMapper<Teacher> {

    List<Teacher> getTeachersAndStudent();

}
