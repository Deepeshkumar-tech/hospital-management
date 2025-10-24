package com.demo.example.student_library_management_system.Converters;

import com.demo.example.student_library_management_system.Model.Student;
import com.demo.example.student_library_management_system.Requestdto.StudentRequestDto;

public class StudentConverter {

    //converter--- it converts coming input request into model and Entity which represents database
    //like it converts StudentRequesttDto into Student model class

    public static Student StudentRequestDtoToStudent(StudentRequestDto studentRequestDto)
    {
        Student student=new Student();
        student.setId(studentRequestDto.getId());
        student.setName(studentRequestDto.getName());
        student.setEmail(studentRequestDto.getEmail());
        student.setMobile(studentRequestDto.getMobile());
        student.setGender(studentRequestDto.getGender());
        student.setDob(studentRequestDto.getDob());
        student.setDept(studentRequestDto.getDept());

        return student;



    }
}
