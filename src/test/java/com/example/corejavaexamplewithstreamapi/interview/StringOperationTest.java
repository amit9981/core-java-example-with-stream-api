package com.example.corejavaexamplewithstreamapi.interview;

import org.junit.jupiter.api.Test;

public class StringOperationTest {

  @Test
  void reverseString() {
    final String reverseString = StringOperation.reverseString("hemant kumar sahu");
    System.out.println(reverseString);
  }

  @Test
  void reverseWord(){
    final String reverseWord = StringOperation.reverseWord("hemant kumar sahu");
    System.out.println(reverseWord);
  }
}