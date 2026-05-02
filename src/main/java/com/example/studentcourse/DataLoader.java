package com.example.studentcourse;

import com.example.studentcourse.entity.Course;
import com.example.studentcourse.entity.Student;
import com.example.studentcourse.repository.CourseRepository;
import com.example.studentcourse.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public DataLoader(StudentRepository studentRepository,
                      CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Course c1 = new Course();
        c1.setCourseName("Java");
        c1.setInstructor("John");

        Course c2 = new Course();
        c2.setCourseName("Python");
        c2.setInstructor("David");

        courseRepository.save(c1);
        courseRepository.save(c2);

        for (int i = 1; i <= 10; i++) {

            Student s = new Student();
            s.setName("Student " + i);
            s.setEmail("student" + i + "@gmail.com");

            if (i % 2 == 0) {
                s.setCourse(c1);
            } else {
                s.setCourse(c2);
            }

            studentRepository.save(s);
        }
    }
}