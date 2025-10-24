package com.demo.example.student_library_management_system.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


@Entity
@Table(name="student")

public class Student
{
    //jason backreference---for joincolumn
    //jasonmanage reference  for mapped by


    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy =GenerationType.IDENTITY)
     int id;


    @Column(name="name",nullable = false)
     private String name;


    @Column(name="email",nullable = false)
     private String email;


    @Column(name="mobile",nullable = false)
     private String mobile;


    @Column(name="dob",nullable = false)
     private String dob;


    @Column(name="gender",nullable = false)
     private String gender;


    @Column(name="dept",nullable = false)
     private String dept;

//relating both table to each other
    @JsonManagedReference
    @OneToOne(mappedBy="student",cascade=CascadeType.ALL)
    private Card card;


    //creating getter and setter for all


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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
