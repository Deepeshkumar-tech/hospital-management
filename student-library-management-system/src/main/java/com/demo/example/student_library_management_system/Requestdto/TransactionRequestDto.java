package com.demo.example.student_library_management_system.Requestdto;

import jakarta.persistence.Column;

import java.util.Date;

public class TransactionRequestDto {


    private String  transactionStatus;
    private Date transactionDate;
    private String dueDate;
    private Double  fine;
    private String issueOrReturn;
    private int bookId;
    private int cardId;


    public String getTransactionStatus() {
        return transactionStatus;
    }


    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }


    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }


    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


    public Double getFine() {
        return fine;
    }

    public void setFine(Double fine) {
        this.fine = fine;
    }

    public String getIssueOrReturn() {
        return issueOrReturn;
    }

    public void setIssueOrReturn(String issueOrReturn) {
        this.issueOrReturn = issueOrReturn;
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }


    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
}
