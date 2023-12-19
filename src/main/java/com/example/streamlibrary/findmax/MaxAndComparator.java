package com.example.streamlibrary.findmax;

import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
    public static Person getOldestPeople(List<Person> people) {
        Person oldestPeople = new Person("", 0);
        for (Person person : people) {
            if (person.getAge() > oldestPeople.getAge()) {
                oldestPeople = person;
            }
        }
        return oldestPeople;
    }

    public static Person findOldestPeople(List<Person> people) {
        return people.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElseThrow(null);
    }
}
