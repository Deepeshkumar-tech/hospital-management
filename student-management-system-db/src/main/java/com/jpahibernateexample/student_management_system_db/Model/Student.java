package com.jpahibernateexample.student_management_system_db.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.Length;

//@Data //for getter setter
@Entity //for representating table
@Table(name="student") //creatiing table in database
public class Student {                                        //t take class entities/attributes //
     @Id  //taking as primary key which cant take dubliplcate value
    @Column(name="studentId",nullable = false)
    private int studentId;
    @Column(name="name",nullable = false)
    private String name;
    @Column(name="email" ,nullable = false,unique=true)
    private String email;
    @Column(name="dob",nullable = false)
    private String  dob;
    @Column(name="gender",nullable = false)
    private String gender;
    @Column(name="grade" ,nullable = false)
    private String grade;
    @Column(name="mobile" ,nullable = false, length = 10)
    private String mobile;

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }




}
