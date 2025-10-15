package com.demo.example.student_library_management_system.Service;


import com.demo.example.student_library_management_system.Converters.StudentConverter;
import com.demo.example.student_library_management_system.Model.Card;
import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Repository.StudentRepository;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

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


            student.setCard(card);
            card.setStudent(student);

            studentRepository.save(student);
            return "Student is saved  successfully";
        }


             public Student getStudentById(int id)
               {

                   Optional<Student> studentOptional=studentRepository.findById(id);
                   studentOptional.get();
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

             public Student deleteStudentById(int id)
             {
                 Student student = studentRepository.deleteById(id);
                 return "Student is deleted by is id" + id +"successfully";

             }

             public String updateStudentById(int id , String mobile) {
                 //first to check student  id present or not if present then update otherwise not

                 Student student = studentRepository.getStudentById(id, mobile);

                 if (student != null) {
                     //update

                     student.setName(studentRequestDto.getName());
                     student.setEmail(studentRequestDto.getEmail());
                     student.setMobile(studentRequestDto.getMobile());
                     student.setDob(studentRequestDto.getDob());
                     student.setGender(studentRequestDto.getGender());
                     student.setDept(studentRequestDto.getDept());

                     //After udating students variables

                     studentRepository.save(student);
                     return "student is updated successfull";

                 } else {
                     //not update
                     return " Sttudent can be updated because student is not getting ";
                 }
             }




                 public String updateStudentByPatch(int id ,Sting mobile )
                 {
                     //first to check student  id present or not if present then update otherwise not

                     Student student=studentRepository.getStudentById( id );

                     if(student!=null)
                     {
                         //update


                         student.setMobile(mobile);


                         //After udating students variables

                         studentRepository.save(student);
                         return "student is updated successfull";

                     }
                     else
                     {
                         //not update
                         return " Sttudent can be updated because student is not getting ";
                     }


                 }
















}
