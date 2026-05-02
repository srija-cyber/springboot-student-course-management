package com.example.studentcourse.controller;

import com.example.studentcourse.entity.Student;
import com.example.studentcourse.service.CourseService;
import com.example.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.dao.DataIntegrityViolationException;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("students",
                studentService.getStudentsWithCourses());

        return "students";
    }

    @GetMapping("/addStudent")
    public String addStudentForm(Model model) {

        model.addAttribute("student", new Student());
        model.addAttribute("courses",
                courseService.getAllCourses());

        return "addStudent";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student) {

        studentService.saveStudent(student);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id,
                              Model model) {

        model.addAttribute("student",
                studentService.getStudentById(id));

        model.addAttribute("courses",
                courseService.getAllCourses());

        return "editStudent";
    }

    @PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute Student student) {

        studentService.saveStudent(student);

        return "redirect:/";
    }
    @ExceptionHandler(DataIntegrityViolationException.class)
    public String handleException() {

        return "error";

    }
}