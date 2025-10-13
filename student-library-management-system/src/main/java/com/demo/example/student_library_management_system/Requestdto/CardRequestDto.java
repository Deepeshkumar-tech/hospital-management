package com.demo.example.student_library_management_system.Requestdto;

import jakarta.persistence.Column;

public class CardRequestDto {


    private String cardStatus;
    private int studentId;

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
