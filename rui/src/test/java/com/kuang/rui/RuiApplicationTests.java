package com.kuang.rui;


import com.kuang.rui.mapper.StudentMapper;
import com.kuang.rui.pojo.Club;
import com.kuang.rui.mapper.ClubMapper;
import com.kuang.rui.pojo.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class RuiApplicationTests {

    @Autowired
    private ClubMapper clubRepository;

    @Autowired
    private StudentMapper studentMapper;
    @Test
    void contextLoads() {
    }
    @Test
    void findClub(){
        List<Club> all = clubRepository.getClub();
        System.out.println(all);
    }

    @Test
    void findStu(){
        List<Student> all = studentMapper.getAllStu();
        System.out.println(all);
    }

    @Test
    void getStuById(){
        Student e = studentMapper.getStuById(1);
        System.out.println(e);
    }

    @Test
    @Transactional
    @Rollback
    void delete(){
        studentMapper.deleteStuById(1);
        List<Student> all = studentMapper.getAllStu();
        System.out.println(all);
    }

    @Test
    @Transactional
    @Rollback
    void add(){

        List<Student> all = studentMapper.getAllStu();
        System.out.println(all);
    }
}
