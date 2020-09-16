package com.example.corejavaexamplewithstreamapi.interview;

import java.util.Arrays;
import java.util.List;

public class FindSumOfAge {

  public static int getSum(List<Employee> empList) {
    final int sum = empList.stream().map(Employee::getAge).mapToInt(Integer::intValue).sum();
    return sum;

  }

}
