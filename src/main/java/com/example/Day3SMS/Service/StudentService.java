package com.example.Day3SMS.Service;

import com.example.Day3SMS.Model.StudentModel;
import com.example.Day3SMS.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentModel addStudent(StudentModel student){
        return repository.save(student

        );
    }
}
