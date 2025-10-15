package com.demo.example.student_library_management_system.Converters;

import com.demo.example.student_library_management_system.Model.Author;
import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Requestdto.AuthorRequestDto;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;

public class AuthorConvertor {


    public static Author AuthorRequestDtoToAuthor(AuthorRequestDto authorRequestDto)
    {
        Author author=new Author();

        author.setName(authorRequestDto.getName());
        author.setCountry(authorRequestDto.getCountry());
        author.setRating(authorRequestDto.getRating());

        return author;



    }
}



