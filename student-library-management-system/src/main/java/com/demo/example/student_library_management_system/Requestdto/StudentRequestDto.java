package com.demo.example.student_library_management_system.Requestdto;

import com.demo.example.student_library_management_system.Model.Student;
import jakarta.persistence.Column;

public class  StudentRequestDto {

   public void Sample()
   {
       Student student=new Student();
       student.getId();
       student.getName();

   }



    //DTO-data tansfer object-it is taken for input request fields




    private int id;
    private String name;
    private String email;
    private String mobile;
    private String dob;
    private String gender;
    private String dept;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}
