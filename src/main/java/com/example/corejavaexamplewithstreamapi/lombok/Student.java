package com.example.corejavaexamplewithstreamapi.lombok;

public class Student {
     private Integer id;
     private String name;

    Student (Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static StudentBuilder builder ( ) {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private Integer id;
        private String name;

        StudentBuilder ( ) {
        }

        public StudentBuilder id (Integer id) {
            this.id = id;
            return this;
        }

        public StudentBuilder name (String name) {
            this.name = name;
            return this;
        }

        public Student build ( ) {
            return new Student(id, name);
        }

        public String toString ( ) {
            return "Student.StudentBuilder(id=" + this.id + ", name=" + this.name + ")";
        }
    }
}
