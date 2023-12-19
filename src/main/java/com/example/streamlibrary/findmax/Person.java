package com.example.streamlibrary.findmax;

public class Person {
    public  String name;
    public int age;
    public String nationality;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
}