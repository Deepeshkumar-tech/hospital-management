package com.demo.example.student_library_management_system.Converters;

import com.demo.example.student_library_management_system.Model.Author;
import com.demo.example.student_library_management_system.Model.Book;
import com.demo.example.student_library_management_system.Requestdto.AuthorRequestDto;
import com.demo.example.student_library_management_system.Requestdto.BookRequestDto;

   public class BookConvertor
 {

    public static Book BookRequestDtoToBook(BookRequestDto bookRequestDto)
    {
        Book book=new Book();

        book.setTitle(bookRequestDto.getTitle());
        book.setPages(bookRequestDto.getPages());
        book.setPublisherName(bookRequestDto.getPublisherName());
        book.setGenre(bookRequestDto.getGenre());
        book.setAvailable(bookRequestDto.isAvailable());

        return book;



    }
 }
