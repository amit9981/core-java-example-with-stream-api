package com.example.corejavaexamplewithstreamapi.interview.service;


import com.example.corejavaexamplewithstreamapi.interview.dto.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListByMarks {

    public static void sort (List<Student> studentList) {
        final Comparator<Student> comparingMark = Comparator.comparing(Student::getMark, Comparator.reverseOrder());
        final Comparator<Student> comparingFistName = Comparator.comparing(Student::getFirstName, Comparator.reverseOrder());
        final Comparator<Student> comparingLastName = Comparator.comparing(Student::getLastName, Comparator.reverseOrder());
        final Comparator<Student> studentComparator = comparingMark.thenComparing(comparingFistName)
                .thenComparing(comparingLastName);
        Collections.sort(studentList, studentComparator);
    }

}
