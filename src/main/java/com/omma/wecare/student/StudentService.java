package com.omma.wecare.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "omma",
                "email.com",
                LocalDate.of(1992, Month.of(12),12),
                12));
    }
}
