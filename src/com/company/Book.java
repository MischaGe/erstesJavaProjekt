package com.company;

public class Book {

    public int id;
    public String title;
    public int pages;
    public Author author;


    public Book(int id, String title, int pages, Author author) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

}
