package com.example.streamlibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        System.out.println(mapToUpperCase("Aylin", "baba", "farid"));
        System.out.println(mapToUpperCase2("Aylin", "baba", "farid"));
    }

    public static Collection<String> mapToUpperCase(String... names) {
        Collection<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }
        return uppercaseNames;
    }

    public static Collection<String> mapToUpperCase2(String... names) {
        return Arrays.stream(names)
                .map(name->name.toUpperCase())
                .collect(Collectors.toList());
    }
}
