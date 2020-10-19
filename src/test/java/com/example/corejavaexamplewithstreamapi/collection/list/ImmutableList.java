package com.example.corejavaexamplewithstreamapi.collection.list;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ImmutableList {

  @Test
  void testListImmutable() {
    List<String> strings = Arrays.asList("hemant", "Kumar");
    System.out.println(strings);
    strings.add("sahu"); //java.lang.UnsupportedOperationException RuntimeException
    System.out.println(strings);
  }
}
