package com.student_management_system2._db.example.student_management_system2_db.repository;

import com.student_management_system2._db.example.student_management_system2_db.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID>
{

}
