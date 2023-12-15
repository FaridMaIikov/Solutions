package com.example.example3;

import java.util.Scanner;

public class Solution {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        star(sc.nextInt());
    }

    public static void star(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <=n-(i+1) ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
