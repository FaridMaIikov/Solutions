package com.example.streamlibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
//        System.out.println( transform("Farid","Teymur","hdbcbbvj"));
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
}
