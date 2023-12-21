package com.example.streamlibrary.partition;


import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Person p1=new Person("Farid",23,"Azerbaijan");
        Person p2=new Person("Ali",16,"Turkish");
        Person p3=new Person("Gerd",33,"German");

        System.out.println(GroupingByAge.groupingAdults(Arrays.asList(p1,p2,p3)));

        System.out.println(GroupingByAge.groupingAdults1(Arrays.asList(p1,p2,p3)));
    }
}
