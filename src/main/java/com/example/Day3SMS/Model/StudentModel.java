package com.example.Day3SMS.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Documented
@Document(collection="students")

public class StudentModel {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
