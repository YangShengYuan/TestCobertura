package com.example.shenmi.mapper;

import com.example.shenmi.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Yang ShengYuan
 * @date 2019/5/18
 * @Description ${DESCRIBE}
 **/
@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM student")

    List<Student> findAll();

    //dsaasdadda//
}
