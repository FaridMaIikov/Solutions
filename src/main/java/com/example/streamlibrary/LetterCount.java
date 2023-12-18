package com.example.streamlibrary;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println( getTotalNumbersOfLetterOfNamesLongerThanFive("Farid","Teymur","hdbcbbvj"));
    }

    public static int getTotalNumbersOfLetterOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).filter(name -> name.length() > 5)
                .mapToInt(name -> name.length()).sum();
    }
}
