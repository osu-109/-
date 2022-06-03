package com.kuang.rui.service;

import com.kuang.rui.pojo.Admin;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


public interface AdminService {
    String adminLogin(String username, String password, Model model, HttpSession httpSession);
}
