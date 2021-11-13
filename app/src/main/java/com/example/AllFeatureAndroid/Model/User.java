package com.example.AllFeatureAndroid.Model;

public class User {
    private String name;
    private int Age;
    private String DOB;

    public User(String name, int age, String DOB) {
        this.name = name;
        this.Age = age;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
