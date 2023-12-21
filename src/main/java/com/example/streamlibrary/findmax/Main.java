package com.example.streamlibrary.findmax;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("Farid",23,"Azerbaijan");
        Person p2=new Person("Ali",16,"Turkish");
        Person p3=new Person("Gerd",33,"German");

        Person oldestPerson=MaxAndComparator.getOldestPeople(Arrays.asList(p1,p2,p3));
        System.out.println(oldestPerson);

        Person oldestPerson1=MaxAndComparator.findOldestPeople(Arrays.asList(p1,p2,p3));
        System.out.println(oldestPerson1);
    }
}
