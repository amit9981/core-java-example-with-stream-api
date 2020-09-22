package com.example.corejavaexamplewithstreamapi.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.Test;

class ListOperationTest {

  @Test
  void removeNull() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 4, 2, 5, null, 76, null));
    ListOperation.removeNull(integerList);
    System.out.println(integerList);
  }

  @Test
  void removeAllNull() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 5, 5, null, 76, null));
    ListOperation.removeAllNull(integerList);
    System.out.println(integerList);
  }

  @Test
  void removeDuplicate() {
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 5, 5, null, 76, null));
    final List<Integer> integersUp = ListOperation.removeDuplicate(integerList);
    System.out.println(integersUp);
  }
  @Test
  void removeDuplicateJava8(){
    List<Integer> integerList = new ArrayList<>(Arrays.asList(2, 4, 5, 5, null, 76, null));
    final List<Integer> integersUp = ListOperation.removeDuplicateJava8(integerList);
    System.out.println(integersUp);
  }
}