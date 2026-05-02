package com.example.studentcourse.service;

import com.example.studentcourse.entity.Student;
import com.example.studentcourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getStudentsWithCourses() {
        return studentRepository.getStudentsWithCourses();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}