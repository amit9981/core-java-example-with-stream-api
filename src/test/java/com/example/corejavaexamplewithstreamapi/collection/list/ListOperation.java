package com.example.corejavaexamplewithstreamapi.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListOperation {

  @Test
  void list() {
    List<String> names = new ArrayList<String>();
    names.add("Mahesh ");
    names.add("Suresh ");
    names.add("Ramesh ");
    names.add("Naresh ");
    names.add("Kalpesh ");
    final List<String> collect = names.stream().map(String::toUpperCase)
        .collect(Collectors.toList());
    System.out.println(collect);
  }

  @Test
  void listEmp() {
    List<Emp> empList = Arrays.asList(Emp.builder().id(54).name("hemant").build()
        , Emp.builder().id(53).name("kumar").build(),
        Emp.builder().id(84).name("sahu").build(),
        Emp.builder().id(94).name("sonu").build()
    );

    final List<String> collect = empList.stream().map(name -> name.getName().toUpperCase())
        .collect(Collectors.toList());
    System.out.println(collect);
    List<Emp> collect1 = empList.stream().map(name -> {
      return Emp.builder().id(name.getId()).name(name.getName().toUpperCase()).build();
    }).collect(Collectors.toList());
    System.out.println(collect1);
  }

  @DisplayName("removed all null")
  @Test
  void listSize(){
    List<String> strings1  = new ArrayList<>();
    strings1.add(null);
    strings1.add(null);
    List<String> strings2  = new ArrayList<>(2);
    strings1.removeIf(f->f==null);
    System.out.println(strings1.size()+" "+strings2.size());
  }


}
