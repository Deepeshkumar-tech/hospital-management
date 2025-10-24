package com.demo.example.student_library_management_system.Service;


import com.demo.example.student_library_management_system.Converters.StudentConverter;
import com.demo.example.student_library_management_system.Model.Card;
import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Repository.StudentRepository;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.StringDecoder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

 @Service
 public class StudentService
 {

       @Autowired
      private StudentRepository studentRepository;



        public String addStudent(StudentRequestDto  studentRequestDto)
        {
          //we can not save requestDto into database directly thats why we have to convert into model class by converter
          //this converts request dto  into model class  in database mySQl
            //after saving student my card is have to show active through this


          Student student= StudentConverter.StudentRequestDtoToStudent(studentRequestDto);

            Card card=new Card();
            card.setCardStatus("Active");


           // student.setCard(card);
           // card.setStudent(student);

            studentRepository.save(student);
            return "Student is saved  successfully";
        }


             public Student getStudentById(int id)
               {

                   Optional<Student> studentOptional=studentRepository.findById(id);
                     studentOptional.get();
                   if(!studentOptional.isPresent())
                   {
                         throw new RuntimeException("student is not found  with this id "+id);
                   }
                   return  studentOptional.get();
               }

              public List<Student> getAllStudent()
               {
                  List<Student> studentList=studentRepository.findAll();
                  return studentList;
               }

              public String countStudents()
               {
                   Long Count =studentRepository.count();
                   return "Total no of students"+Count;
               }

//            public Student deleteStudentById(int id)
//            {
//             String student1 = studentRepository.deleteById(id);
//                //return "Student is deleted by is id successfully";
//            }

//             public  String updateStudentById(StudentRequestDto  studentRequestDto)
//             {
//
//                 //first to check student  id present or not if present then update otherwise not
//
//                 Student student =studentRepository.getById(int id,);
//
//                 if (student != null)
//                 {
//                     //update
//
//                     student.setName(studentRequestDto.getName());
//                     student.setEmail(studentRequestDto.getEmail());
//                     student.setMobile(studentRequestDto.getMobile());
//                     student.setDob(studentRequestDto.getDob());
//                     student.setGender(studentRequestDto.getGender());
//                     student.setDept(studentRequestDto.getDept());
//
//                     //After udating students variables
//
//                     studentRepository.save(student);
//                     return "student is updated successful";
//
//                 } else {
//                     //not update
//                     return " Student can be updated because student is not getting ";
//                 }
//             }




//                 public String updateStudentByPatch(int id ,String mobile ) {
//                     //first to check student  id present or not if present then update otherwise not
//
//                     Student student=studentRepository.getReferenceById(id);
//
//                     if(student != null)
//                     {
//                         //update
//
//                         student.setMobile(mobile);
//
//                         //After udating students variables
//                         studentRepository.save(student);
//                         return "student is updated successful";
//
//                     } else
//                     {
//                         //not update
//                         return " Student can be updated because student is not getting ";
//                     }
//                 }

//                    // pagination and sorting

//                    public List<Student> getStudentBasedOnPage(int pageNo,int pageSize)
//                    {
//
//                         Page<Student> studentPage = studentRepository.findAll(PageRequest.of(pageNo, pageSize, Sort.by(...
//                         properties:
//                         "name")))
//                         //we have to convert page into list so that we can see on front end easily
//                         List<Student> studentList = studentPage.getContent();
//                         return studentList;
//
//                    }


                         public Student getStudentByEmail1(String email)
                        {
                        Student studentemail = studentRepository.findByEmail(email);
                         return studentemail;
                       }

                         public List<Student>getStudentByEmailOrDept(String email, String dept)
                        {
                           List<Student>studentList=studentRepository.findByEmailOrDept(email,dept);
                           return studentList;
                        }

//                        public List<Student> getStudendByDept(String dept)
//                       {
//                          List<Student> studentList=studentRepository.findStudentByQuery(dept);
//                          return studentList;
//                       }


































}