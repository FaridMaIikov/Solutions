package com.example.streamlibrary.peopletokids;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Farid", 23, "Azerbaijan");
        Person p2 = new Person("Ali", 16, "Turkish");
        Person p3 = new Person("Gerd", 33, "German");

        System.out.println(UnderAge.getKidNames(Arrays.asList(p1,p2,p3)));

        System.out.println(UnderAge.getKidNames2(Arrays.asList(p1,p2,p3)));
    }
}
