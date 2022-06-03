package com.kuang.rui.mapper;


import com.kuang.rui.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/***
 * @Description:
 * @Author: Wang Rui
 * @Date: $
 */
@Mapper
@Repository
public interface StudentMapper {

    List<Student> getAllStu();

    int deleteStuById(@Param("sid") long sid);

    int addStu(Student student);

    Student getStuById(long id);

    int updateStu(Student student);



}
