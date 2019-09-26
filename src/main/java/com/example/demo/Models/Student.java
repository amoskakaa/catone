package com.example.demo.Models;

import org.aspectj.weaver.Lint;

public class Student {
    private int studentNumber;
    private Long id;
    private String firstName;


    public Student(){
        }

    public Student(int studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ",studentNumber=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
