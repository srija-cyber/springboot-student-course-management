package com.example.studentcourse.service;

import com.example.studentcourse.entity.Student;
import com.example.studentcourse.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;

    @InjectMocks
    private StudentService studentService;

    public StudentServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllStudents() {

        when(studentRepository.findAll())
                .thenReturn(new ArrayList<>());

        assertEquals(0,
                studentService.getAllStudents().size());
    }
}