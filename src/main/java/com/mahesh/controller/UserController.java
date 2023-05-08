package com.mahesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
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

//    Handler for Conditional statement
    @GetMapping("/condition")
    public String conditionalHandler(Model model){
        System.out.println("Conditional Handler Executed");
        model.addAttribute("isActive", true);
        model.addAttribute("gender", "F");

        List<Integer> numbers = List.of(231, 43, 78, 89, 90, 81, 23);
        model.addAttribute("myList", numbers);

        return "condition";
    }

//    Handler for fragments
    @GetMapping("/fragment")
    public String servicesHandler(Model model){
        model.addAttribute("title", "Nothing is impossible");
        model.addAttribute("subtitle", LocalDateTime.now().toString());

        return "service";
    }
}
