package com.example.example5;

class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Student other) {
        if (this.gpa != other.gpa) {
            return Double.compare(other.gpa, this.gpa); // Higher CGPA first
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name); // Ascending alphabetical order of name
        } else {
            return Integer.compare(this.id, other.id); // Ascending order of id
        }
    }
}