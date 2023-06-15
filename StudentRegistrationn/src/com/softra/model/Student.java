package com.softra.model;

public class Student {
    private String name;
    private int age;
    private String mobileno;
    private String address;

    
    public Student(String name, int age, String mobileno, String address) {
        this.name = name;
        this.age = age;
        this.mobileno = mobileno;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
