package com.example.example9;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
          System.out.printf("%-15s%03d\n",s1,x);
        }
        System.out.println("================================");

    }
}
