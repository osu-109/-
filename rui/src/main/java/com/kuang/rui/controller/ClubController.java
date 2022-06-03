package com.kuang.rui.controller;

import com.kuang.rui.pojo.Club;
import com.kuang.rui.pojo.Student;
import com.kuang.rui.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ClubController {
    @Autowired
    ClubService clubService;


    @RequestMapping("/con")
    public String list(Model model){
        return clubService.getClub(model);
    }

    @GetMapping("/emp2")
    public String toAddClub(Model model) {
        return clubService.toaddClub(model);
    }

    @PostMapping("/emp2")
    public String addClub(Club club){
        return clubService.addClub(club);
    }

    @GetMapping("/emp2/clubupdate/{id}")
    public String toupdateClub(@PathVariable("id") int id, Model model) {
        return clubService.toupdateClub( id, model);

    }
    @PostMapping("/emp2/clubupdate2")
    public String updateStu(Club club) {
        return clubService.updateClub(club);
    }

    @GetMapping("/emp2/deleteclub/{id}")
    public String delete(Model model, @PathVariable(name = "id") int id){
        return clubService.deleteClub(model,id);
    }
}
