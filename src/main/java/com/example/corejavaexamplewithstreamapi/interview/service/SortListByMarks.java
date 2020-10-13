package com.example.corejavaexamplewithstreamapi.interview.service;


import com.example.corejavaexamplewithstreamapi.interview.dto.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListByMarks {

  private static List<Student> studentList;

  static {
    studentList = Arrays.asList(new Student(121, "hemant", "sahu", 45),
        new Student(129, "sahu", "sahu", 46),
        new Student(120, "chitresh", "sahu", 33),
        new Student(101, "sarita", "sahu", 50),
        new Student(111, "shaw", "sahu", 50)
        );
  }

  public static void main(String[] args) {
    System.out.println(studentList);
    Collections.sort(studentList,marks);
    System.out.println(studentList);

  }
 public static Comparator<Student> marks = new Comparator<Student>(){

     @Override
     public int compare(Student o1, Student o2) {
       if (o2.getMark() - o1.getMark() > 0)
         return 1;
       else if (o2.getMark() - o1.getMark() < 0)
         return -1;
       else if (o2.getMark() == o1.getMark())
         return o2.getFastName().compareTo(o1.getFastName());
       return 0;

     }
 };

}
