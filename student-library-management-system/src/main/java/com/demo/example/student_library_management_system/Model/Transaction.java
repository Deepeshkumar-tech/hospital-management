package com.demo.example.student_library_management_system.Model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="transaction")

public class Transaction
{
    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    @Column(name="transaction_Status",nullable = false)
    private String  transactionStatus;

    @Column(name="transaction_Date",nullable = false)
    private Date transactionDate;

    @Column(name="due_Date",nullable = false)
    private String dueDate;

    @Column(name="fine",nullable = false)
    private Double  fine;

    @Column(name="issue_Or_Return",nullable = false)
    private String issueOrReturn;



    @ManyToOne
    @JoinColumn
     private Card card;


    @ManyToOne
    @JoinColumn
    private Book book;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

