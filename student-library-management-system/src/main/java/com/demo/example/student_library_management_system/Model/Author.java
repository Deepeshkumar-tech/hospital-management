package com.demo.example.student_library_management_system.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="author")
public class Author
{
     @Id
     @Column(name =" id",nullable = false)
     @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id ;

    @Column(name ="name",nullable = false)
    private String name;

    @Column(name ="country",nullable = false)
    private String country;

    @Column(name ="rating",nullable = false)
     private Double rating;


    //creating relation between author and book table and making foreign key in book table

       @JsonManagedReference
       @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
       private List<Book> bookByAuthor=new ArrayList<>();



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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<Book> getBookByAuthor() {
        return bookByAuthor;
    }

    public void setBookByAuthor(List<Book> bookByAuthor) {
        this.bookByAuthor = bookByAuthor;
    }




}
