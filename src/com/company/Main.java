package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("losgehts");

        Author auth = new Author("jkrowling", 50);
        Book buch = new Book(1, "harryprozzer", 1000, auth);

        System.out.println(buch.getTitle());

    }
}