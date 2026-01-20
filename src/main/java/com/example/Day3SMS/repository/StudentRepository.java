package com.example.Day3SMS.repository;

import com.example.Day3SMS.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface

StudentRepository extends MongoRepository <StudentModel , String> {
}
