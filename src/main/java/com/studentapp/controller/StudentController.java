package com.studentapp.controller;

import com.studentapp.model.Student;
import com.studentapp.repo.StudentRepo;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class StudentController
{
    @Autowired
    StudentRepo studentRepo;

    // get all students
    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }
}
