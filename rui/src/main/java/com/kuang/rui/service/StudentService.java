package com.kuang.rui.service;


import com.kuang.rui.pojo.Student;
import org.springframework.ui.Model;


public interface StudentService {
    //获取全部员工
    String getAllStu(Model model);
    //删除员工
    String deleteStu(Model model, long sid);
    //增加员工
    String toaddStu(Model model);
    String addStu(Student student);
    //通过id查询员工信息
    Student getStuById(long sid);
//    修改员工信息
    String toupdateStu(long sid, Model model);
    String updateStu(Student student);
}
