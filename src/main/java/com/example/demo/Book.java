package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name ="book")
public class Book {
    @Id
  //  @GeneratedValue
    private int id;

    @NotBlank
    private String bookname;

    public Book ()
    {
        super();
    }
    public Book(int id, String bookname)
    {
        super();
        this.id=id;
        this.bookname=bookname;
    }
    public int getId()
    {
        return id;
    }

    public int setId(int id)

    {
        this.id=id;
        return id;
    }

    public String getName()

    {
        return bookname;
    }

    public String setName(String bookname)
    {
        this.bookname=bookname;
        return bookname;
    }
}

