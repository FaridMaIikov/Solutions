package com.example.example2;

import java.util.List;

public class Result {
    public static long aVeryBigSum(List<Long> ar) {
        long result=0;
        for (int i = 0; i < ar.size(); i++) {
            result+= ar.get(i);
        }
        return result;
    }
}