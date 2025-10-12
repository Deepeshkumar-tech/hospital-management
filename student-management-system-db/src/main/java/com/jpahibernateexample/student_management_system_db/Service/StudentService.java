package com.jpahibernateexample.student_management_system_db.Service;

import com.jpahibernateexample.student_management_system_db.Model.Student;
import com.jpahibernateexample.student_management_system_db.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service  // we taken here business logic and validations
public class StudentService {
@Autowired //created internally object/IOC
      private StudentRepository studentRepository;

      public String addStudent( Student studentRequest)
     {
      studentRepository.save(studentRequest);
      return "Student data is saved successfully";
     }

      public List<Student> getAllStudents()
      {
         List<Student> studentList=studentRepository.findAll();
         return studentList;
      }

         public Student getStudentById(int id)
        {
           Optional<Student>studentOptional=studentRepository.findById(id);
            return studentOptional.get();
        }

       public String deleteStudentById(int id)
       {
           studentRepository.deleteById(id);
           return "Student is deleted succesfully with is "+id;
       }

}
