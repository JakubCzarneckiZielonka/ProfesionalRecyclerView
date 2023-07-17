package com.example.myapplicationugyvbkytifcvfuyg;

public class Movie {
    //2.tworzymy stringi
    private String title,genre,date;
    //3.tworzymy konstruktor który inicjuje objekt
    public Movie(String title, String genre, String date) {
        this.title = title;
        this.genre = genre;
        this.date = date;
    }
    //4 towrzymy gettery i settery by kontrolować dostęp do pól
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
