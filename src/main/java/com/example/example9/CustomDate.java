package com.example.example9;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CustomDate {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        String result = daysOfWeek[dayOfWeek - 1];

        return result;
    }
    public static Date findDay1(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        Date customDate = calendar.getTime();

        return customDate;
    }

    public static void main(String[] args) {


        String result = findDay(11, 12, 2023);
        Date result1 = findDay1(11, 12, 2023);

        System.out.println("Custom Date: " + result);
    }
}
