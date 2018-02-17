package com.me;

public class Movie {

    //fields
    public String title;
    public int year;
    public String rating;
    public String genre;
    public int length;

    //constructor with parameters
    public Movie(String title, int year, String rating, String genre,
                 int length){

        this.title = title;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        this.length = length;

    }

    //getter methods for this. fields
    public String getTitle(){
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public String getRating(){
        return this.rating;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getLength(){
        return this.length;
    }

}
