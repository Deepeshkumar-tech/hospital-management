package com.demo.example.student_library_management_system.Requestdto;

import jakarta.persistence.Column;

public class AuthorRequestDto {



    private String name;
    private String country;
    private Double rating;


    //getter setter


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
}
