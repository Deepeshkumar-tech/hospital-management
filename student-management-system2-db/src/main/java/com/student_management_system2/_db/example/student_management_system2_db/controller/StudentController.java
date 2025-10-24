package com.student_management_system2._db.example.student_management_system2_db.controller;

import com.student_management_system2._db.example.student_management_system2_db.model.Student;
import com.student_management_system2._db.example.student_management_system2_db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController
{
    @Autowired
    StudentRepository studentRepository;

   //creating constructor
    public StudentController(StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }

    @PostMapping("/api/db/save")
    public String saveStudent(@RequestBody  Student student)
    {
        studentRepository.save(student);
        return "Success";
    }
}
