package com.student_management_system2.example.student_management_system2.requestbody;

public class StudentRequestBody
{
    String fName;
    String lName;
    int rollNumber;
//  create constructor

    public StudentRequestBody(String fName) {
        this.fName = fName;
    }

//   public StudentRequestBody(String lName) {
//        this.lName = lName;
//    }

    public StudentRequestBody(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    //create getter and setter

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
