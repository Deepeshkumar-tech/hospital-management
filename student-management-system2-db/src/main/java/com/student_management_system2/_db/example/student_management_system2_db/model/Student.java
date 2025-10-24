package com.student_management_system2._db.example.student_management_system2_db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    UUID id;
    String fName;
    String lName;
    int rollNumber;

    //create constructor


    public Student(UUID id) {
        this.id = id;
    }

    public Student(String fName) {
        this.fName = fName;
    }

//    public Student(String lName) {
//        this.lName = lName;
//    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    //creating getter and setter


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
