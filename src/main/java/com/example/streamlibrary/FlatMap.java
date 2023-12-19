package com.example.streamlibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String>a6142=Arrays.asList("Farid","Parviz","Tural");
        List<String>a6132=Arrays.asList("Abdulla","Aga","Ali");
        List<List<String>>uni=Arrays.asList(a6132,a6142);

        System.out.println( transform(uni));
        System.out.println( transform2(uni));
    }

    public static List<String> transform(List<List<String>>collection) {
        List<String>newCollection=new ArrayList<>();
        for (List<String>subCollection: collection){
            for (String value:subCollection){
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform2(List<List<String>>collection){
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
