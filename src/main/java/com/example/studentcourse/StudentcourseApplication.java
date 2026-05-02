package com.example.studentcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.studentcourse.entity")
public class StudentcourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentcourseApplication.class, args);
    }
}