package com.example.streamlibrary.partition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByNationality {

    public static Map<String, List<Person>> groupingByNationality(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();

        for (Person person : people) {
            if (!map.containsKey(person.getNationality())) {
                map.put(person.getNationality(), new ArrayList<>());
            }
            map.get(person.getNationality()).add(person);
        }
        return map;
    }

    public static Map<String, List<Person>> groupingByNationality1(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Person::getNationality, Collectors.toList()));
    }

}
