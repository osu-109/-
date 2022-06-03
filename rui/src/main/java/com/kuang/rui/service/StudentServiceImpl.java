package com.kuang.rui.service;

import com.kuang.rui.mapper.ClubMapper;
import com.kuang.rui.mapper.StudentMapper;
import com.kuang.rui.pojo.Club;
import com.kuang.rui.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    ClubMapper clubMapper;

    @Override
    public String getAllStu(Model model) {
        List<Student> students = studentMapper.getAllStu();
        model.addAttribute("stu", students);
        return "emp/list";
    }

    @Override
    public String deleteStu(Model model, long sid){
         studentMapper.deleteStuById(sid);
         return "redirect:/emps";
    }

    @Override
    public String toaddStu(Model model){
        List<Club> clubs = clubMapper.getClub();
        model.addAttribute("clubs", clubs);
        return "emp/addEmp";
    }
    @Override
    public String addStu(Student student) {
        studentMapper.addStu(student);
        return "redirect:/emps";
    }

    @Override
    public Student getStuById(long sid) {
        return studentMapper.getStuById(sid);
    }

    @Override
    public String toupdateStu(long sid, Model model){
        Student student = studentMapper.getStuById(sid);
        model.addAttribute("emp3", student);
        return "emp/update";
    }
    @Override
    public String updateStu(Student student){
       studentMapper.updateStu(student);
        return "redirect:/emps";
    }


}
