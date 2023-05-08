package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class UserController {

    @GetMapping("/about")
    public String about(Model model){
        System.out.println("Inside about Handler");
        model.addAttribute("name", "Mahesh Kumar");
        model.addAttribute("currentDate", new Date().toString());
        return "about";
    }
}
