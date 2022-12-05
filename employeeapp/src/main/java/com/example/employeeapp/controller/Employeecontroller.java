package com.example.employeeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
    @GetMapping("/")
    public String Loginpage() {
        return "Welocome to my loginpage";
    }
    @GetMapping("/addemployees")
    public String Addemployee(){
        return "Addemployees";
    }
    @GetMapping("/search")
    public String Search(){
        return "Search";
    }
    @GetMapping("/viewall")
    public  String Viewall(){
        return "viewall";
    }
}
