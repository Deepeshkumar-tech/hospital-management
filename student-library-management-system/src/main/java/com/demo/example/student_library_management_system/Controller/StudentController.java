package com.demo.example.student_library_management_system.Controller;


import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;
import com.demo.example.student_library_management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")
public class StudentController
{

    @Autowired
    StudentService studentService;

       @PostMapping("/save")
     public String saveStudent(@RequestBody StudentRequestDto studentRequestDto)
    {
          Student response=studentService.addStudent(studentRequestDto);
          return response;
    }

      @GetMapping("/find/{id}")
     public Student findStudentById(@PathVariable int id )
    {
       Student student=studentService.getStudentById(id);
       return student;

    }

        @GetMapping("/findAll")
      public List <Student>  findAllStudent()
      {
        List <Student> studentList=studentService.getAllStudent();
        return studentList;

      }

      @GetMapping("/count")
      public String countStudents()
      {
         Student response=studentService.countStudents();
         return response;
      }

       @GetMapping("/delete/{id}")
        public String deleteStudentById(@PathVariable int id) {
           Student response = studentService.deleteStudentById(id);
           return response;


       }
         @PutMapping ("/update/{id}")
        public String updateStudentById(@PathVariable int id ,  @RequestBody StudentRequestDto studentRequestDto)
         {

            String response=studentService.updateStudentById(id);
            return response;


         }

            @PatchMapping ("/updatePatch/{id}")

               //@RequestParam=it takes request as query parameter
            public String updateStudentMobileByPatch(@PathVariable int id ,@RequestParam String mobile);
          {

             String response=studentService.updateStudentByPatch(id,mobile);
             return response;

          }

}
