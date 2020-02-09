package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name ="employee")
public class Employee {
    @Id
    @NotNull
    private int id;

    @NotBlank
    private String name;

    public Employee ()
    {
        super();
    }
    public Employee(int id, String name)
    {
        super();
        this.id=id;
        this.name=name;
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
        return name;
    }

    public String setName(String name)
    {
      this.name=name;
        return name;
    }
}
