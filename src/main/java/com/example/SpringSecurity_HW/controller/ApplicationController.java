package com.example.SpringSecurity_HW.controller;

import com.example.SpringSecurity_HW.service.AdminService;
import com.example.SpringSecurity_HW.service.ApplicationService;
import com.example.SpringSecurity_HW.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ApplicationController {
    private final ApplicationService applicationService;
    private final UserService userService;
    private final AdminService adminService;

    public ApplicationController(ApplicationService applicationService, UserService userService, AdminService adminService) {
        this.applicationService = applicationService;
        this.userService = userService;
        this.adminService = adminService;
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("message", userService.getText());
        return "user";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("message", adminService.getText());
        return "admin";
    }
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("message", applicationService.getText());
        return "login";
    }

}
