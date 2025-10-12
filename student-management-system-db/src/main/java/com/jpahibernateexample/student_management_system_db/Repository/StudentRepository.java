package com.jpahibernateexample.student_management_system_db.Repository;

import com.jpahibernateexample.student_management_system_db.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository   //to perform database
public interface StudentRepository extends JpaRepository <Student,Integer>
{


}
