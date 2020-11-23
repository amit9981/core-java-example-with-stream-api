package com.example.corejavaexamplewithstreamapi.designpattern.adaptor.builder;

import com.example.corejavaexamplewithstreamapi.designpattern.builder.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testBuilder(){
        Student student = Student.builder()
                .id(123)
                .name("Hemant")
                .build();
        System.out.println(student);

    }

}