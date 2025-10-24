package com.student_management_system2.example.student_management_system2.controller;

import com.student_management_system2.example.student_management_system2.requestbody.StudentRequestBody;
import com.student_management_system2.example.student_management_system2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

//we are understand here connecting two api to each other by two project

@RestController
@RequestMapping

public class StudentController
{
   @Autowired
    StudentService studentService;
    StudentRequestBody studentRequestBody;

   //constructor is creating for testing purpose/unit testing
    public StudentController(StudentService studentService)
    {
        this.studentService=studentService;
    }

     @PostMapping("/api/front/register")
     public String registerStudent(@RequestBody  StudentRequestBody studentRequestBody)
     {

         studentService.saveStudent(studentRequestBody);
         return "Student got saved successfully";

     }
     @GetMapping("/api/front/weather")
      public Object getWeather(@Value("${X.RapidAPI.Key}"  String XRapidAPIKey),@RequestParam String city)
     {
          return studentService.callWeatherApi(XRapidAPIKey,city);

     }











}
