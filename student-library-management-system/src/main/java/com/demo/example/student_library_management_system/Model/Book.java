package com.demo.example.student_library_management_system.Model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="book")

public class Book
{

    @Id
    @Column(name="id",nullable=false)
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    @Column(name="title",nullable = false)
    private String title;

    @Column(name ="pages",nullable = false)
    private int pages;

    @Column(name="publisher_Name",nullable = false)
    private String publisherName;

    @Column(name ="genre",nullable = false )
    private String  genre;

    @Column(name ="available",nullable = false)
    private boolean available;

    //creating relation between author and book table and making foreign key in book table

    @ManyToOne
    @JoinColumn  //creates foreign key in this table book
    private Author author;


    @ManyToOne
    @JoinColumn
    private Card card;


    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    private List <Transaction> transactions=new ArrayList<>() ;


    //creating getter and setter for all


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
