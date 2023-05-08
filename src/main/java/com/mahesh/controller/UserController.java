package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/about")
    public String about(Model model){
        System.out.println("Inside about Handler");
        model.addAttribute("name", "Mahesh Kumar");
        model.addAttribute("currentDate", new Date().toString());
        return "about";
    }

//    This is for handling iteration
    @GetMapping("/example-loop")
    public String iterateHandler(Model model){

//        Create a List, Set, Array
        List<String> names = List.of("Ankit", "Mohan", "Vibhuti", "Narayan", "Mishra");

        model.addAttribute("names", names);

        return "iterate";
    }
}
