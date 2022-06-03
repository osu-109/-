package com.kuang.rui.controller;


import com.kuang.rui.pojo.Student;
import com.kuang.rui.service.ClubService;
import com.kuang.rui.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    ClubService clubService;

    @RequestMapping("/emps")
    public String list(Model model){
        return studentService.getAllStu(model);
    }

    @GetMapping("/emp/delete/{sid}")
    public String delete(Model model, @PathVariable(name = "sid") long sid){
        return studentService.deleteStu(model,sid);
    }

    @GetMapping("/emp")
    public String toAdd(Model model) {
        return studentService.toaddStu(model);
    }

    @PostMapping("/emp")
    public String add(Student student){
        return studentService.addStu(student);
    }

    @GetMapping("/emp/update/{sid}")
    public String toupdateStu(@PathVariable("sid") long  sid, Model model) {
        return studentService.toupdateStu(sid, model);
    }
    @PostMapping("/emp/update1")
    public String updateStu(Student student) {
        return studentService.updateStu(student);
    }
}
