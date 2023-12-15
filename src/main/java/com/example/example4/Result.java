package com.example.example4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {
    public static int equalizeArray(List<Integer> arr) {
        Collections.sort(arr);

        int element = arr.get(0);
        int current = 1;
        int max = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == element) {
                current++;
            } else {
                element = arr.get(i);
                current = 1;
            }

            max = Math.max(max, current);
        }

        return arr.size() - max;
    }
}
