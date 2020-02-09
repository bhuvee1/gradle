package com.example.demo;

public class BookNotFoundException extends Exception {
    private int id;
    public BookNotFoundException(int id)
    {
        super(String.format("book is not found + %s",id));
    }

}



