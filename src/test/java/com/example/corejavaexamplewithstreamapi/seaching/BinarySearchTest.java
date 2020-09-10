package com.example.corejavaexamplewithstreamapi.seaching;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

  @Test
  void searchElement() {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int searchResult = BinarySearch.searchElement(arr, 8);
    if (searchResult != -1) {
      System.out.println("Index number:" + searchResult + "  searched value:" + arr[searchResult]);
    } else {
      System.out.println("Searching element has not been founded");
    }

  }
}
