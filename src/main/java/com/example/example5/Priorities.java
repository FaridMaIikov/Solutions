package com.example.example5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();

        for (String event : events) {
            String[] elements = event.split(" ");
            if (elements[0].equals("ENTER")) {
                int id = Integer.parseInt(elements[3]);
                String name = elements[1];
                double gpa = Double.parseDouble(elements[2]);
                Student student = new Student(id, name, gpa);
                queue.add(student);
            } else if (elements[0].equals("SERVED")) {
                queue.poll();
            }
        }

        List<Student> studentList = new ArrayList<>(queue);
        studentList.sort(Student::compareTo);
        return studentList;
    }
}
