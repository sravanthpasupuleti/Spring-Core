package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Homecontroller {

    @GetMapping(value="/home")
    public String gethome(){
        return "home.jsp";
    }

    @PostMapping(value="/addCustumer")
    public String getCustumer(@RequestParam String name, @RequestParam String city, @RequestParam String email, Model model){
        // System.out.println("custumer is added");
        // System.out.println(name + " " + city + " " + email);
        model.addAttribute("name" , name);
        model.addAttribute("city" , city);
        model.addAttribute("email" , email);
        return "success.jsp";
    }
}
