package com.example.Day3SMS.Controller;

import com.example.Day3SMS.Model.StudentModel;
import com.example.Day3SMS.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentConroller {
    private final StudentService service;

    public StudentConroller(StudentService service) {
        this.service = service;
    }

    @PostMapping("/add-student")
    public StudentModel addStudent(@RequestBody StudentModel student){
        return service.addStudent(student);
    }
}
