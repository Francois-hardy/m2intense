package com.complogiciel.m2intense.model;

public class Student {
    private final int id;
    private String fname;
    private String lname;
    private String mail;

    public Student(int id, String fname, String lname, String mail){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMail() {
        return mail;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public void setMail(String mail){
        this.mail = mail;
    }
}

