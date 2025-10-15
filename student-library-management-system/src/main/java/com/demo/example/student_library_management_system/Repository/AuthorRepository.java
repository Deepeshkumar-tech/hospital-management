package com.demo.example.student_library_management_system.Repository;

import com.demo.example.student_library_management_system.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorRepository extends JpaRepository<Author,Integer>
{

}
