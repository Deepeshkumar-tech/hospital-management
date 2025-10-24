package com.demo.example.student_library_management_system.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")

public class Card {


    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    @Column(name="card_Status",nullable = false)
    private String cardStatus;

    @Column(name="create_Date",nullable = false)
    @CreationTimestamp()  //it automaticaliy date and time created when card is created and decreated
    private Date createDate;

    @Column(name="update_Date",nullable = false)
    @UpdateTimestamp     //it automaticaliy update date and time created when card is created and decreated
    private Date updateDate;


    //connecting both tables with each other

    @JsonBackReference
    @OneToOne
    @JoinColumn  //this creates foreign key of Student table in card table
    private Student student;

    @JsonManagedReference
     @OneToMany(mappedBy ="card",cascade = CascadeType.ALL)
    private List<Book>booksIssuedtoCard=new ArrayList<>();


     @JsonManagedReference
     @OneToMany(mappedBy ="card" ,cascade = CascadeType.ALL)
    private List<Transaction> transactionIssuedToCard=new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


    public List<Book> getBooksIssuedtoCard() {
        return booksIssuedtoCard;
    }

    public void setBooksIssuedtoCard(List<Book> booksIssuedtoCard) {
        this.booksIssuedtoCard = booksIssuedtoCard;
    }

    public List<Transaction> getTransactionIssuedToCard() {
        return transactionIssuedToCard;
    }

    public void setTransactionIssuedToCard(List<Transaction> transactionIssuedToCard) {
        this.transactionIssuedToCard = transactionIssuedToCard;
    }
}
