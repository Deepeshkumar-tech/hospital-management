package com.demo.example.student_library_management_system.Repository;

import com.demo.example.student_library_management_system.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{
    //writing our own query/writing our own methods
    //1. writing methods by attributes and fields with support with JPA

       public Student  findByEmail(String email);
       public List<Student> findByDept(String dept);

       //And or operations with two fields

      public Student findByEmailAndDept(String email,String dept);
      public List<Student> findByEmailOrDept(String email,String dept);

    //2.writing our own query(to write query)

   // @Query(nativeQuery = true, value="Select * from student where dept=dept1");
    //  public List<Student>findStudentByQuery(String dept);


}
