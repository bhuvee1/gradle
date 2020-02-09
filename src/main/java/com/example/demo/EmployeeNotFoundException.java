package com.example.demo;

public class EmployeeNotFoundException extends Exception{
    private int id;
    public EmployeeNotFoundException(int id)
    {
        super(String.format("employee is not found + %s",id));
    }
}
