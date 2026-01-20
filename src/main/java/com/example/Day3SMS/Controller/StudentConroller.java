package com.example.Day3SMS.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentConroller {
    @GetMapping("/")
    public String student(){
        return "Homepage for Student";
    }
}
