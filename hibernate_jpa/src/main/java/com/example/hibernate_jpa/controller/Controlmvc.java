package com.example.hibernate_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hibernate_jpa.model.Custumer;


@Controller
public class Controlmvc {

    @Autowired
    Custumerrepo repo;

    @GetMapping(value="/index")
    public String gethome(){
        return "index.jsp";
    }

    @PostMapping(value="/details")
    public String getdetails(Custumer data, Model model){
        // System.out.println("your details");
        repo.save(data);
        return "custdetails.jsp";
    }
}
