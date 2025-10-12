package com.jpahibernateexample.student_management_system_db.Controller;

import com.jpahibernateexample.student_management_system_db.Model.Student;
import com.jpahibernateexample.student_management_system_db.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")                                     // to writr API
public class StudentController
{       //controller>>service>>repository
    //here we just send request from frontend to controller and this send to service class methods to call and this goes to repository to fetch data  and comes again to user interface postman
              @Autowired
             StudentService studentService;

              @PostMapping ("/save")
             public String saveStudent(@RequestBody Student studentRequest)
              {
                  String response=studentService.addStudent(studentRequest);
                  return response;
              }

              @GetMapping("/findAll")
           public List<Student> findAllStudent()
           {
               List<Student> studentList=studentService.getAllStudents();
               return studentList;
           }
             @GetMapping("/find/{id}")
          public Student findStudentById( @PathVariable int id)
          {
            Student student=studentService.getStudentById(id);
            return student;

          }
           @DeleteMapping("/delete")
          public String deleteStudentById(@PathVariable int id )
          {
             String response=studentService.deleteStudentById(id);
              return response;
          }





}
