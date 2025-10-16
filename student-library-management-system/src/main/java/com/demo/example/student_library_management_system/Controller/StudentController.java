package com.demo.example.student_library_management_system.Controller;


import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;
import com.demo.example.student_library_management_system.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")
public class StudentController
{

    @Autowired
    StudentService studentService;
         //adding respoonse entity

       @PostMapping("/save")
     public ResponseEntity<?> saveStudent(@RequestBody StudentRequestDto studentRequestDto)
    {
        try
        {
            Student response = studentService.addStudent(studentRequestDto);
            return ResponseEntity.ok(response);

        } catch (Exception e)
        {

            return  ResponseEntity.internalServerError().body(e.getMessage());
        }

    }

      @GetMapping("/find/{id}")
     public ResponseEntity<?> findStudentById(@PathVariable int id )
    {
        try
        {
            Student student = studentService.getStudentById(id);
            return ResponseEntity.ok(student);
        } catch (Exception e)
        {

            return RequestEntity.internalServerError().body(e.getMessage());
        }
    }

        @GetMapping("/findAll")
      public ResponseEntity<?> findAllStudent()
      {
        List <Student> studentList=studentService.getAllStudent();
        return ResponseEntity.ok(studentList);

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
              @GetMapping("/findByPage")
              public  List<Student> findStudentsBasedOnPage(@RequestParam int pageNo,@RequestParam int pageSize)
              {
                 List<Student>studentList=studentService.getStudentsBasedOnPage(pageNo,pageSize);
                 return studentList;

              }
                @GetMapping("/findByMail")
              public Student findStudentByEmail (String email)
              {
                 Student student=studentService.getStudentByEmail(@RequestParam email);
                 return student;
              }
                 @GetMapping("/findByEmailOrDept")
               public List<Student> findStudentByEmailOrDept (String email, String dept)
               {

                   List<Student>studentList =studentService.getStudentByEmailOrDept (email,dept);
                   return studentList;
               }
                 @GetMapping("/findByDept")
                public List<Student> findStudentByDept(String dept)
                {

                    List<Student>studentList =studentService.getStudendByDept(dept);
                    return studentList;
                }

                //adding response entity in above apis
                 //responseentity---takes response from API and send it to the frontend like
                 //respoponse code ;http code:
                    //200-ok -success
                    //201--created
                    //400-bad request
                    //401-unauthorised
                   //404- not found
                   //500-internal server error

                  //adding exeption handling in above apis










}
