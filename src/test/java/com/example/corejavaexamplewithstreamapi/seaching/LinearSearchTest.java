package com.example.corejavaexamplewithstreamapi.seaching;

import org.junit.jupiter.api.Test;

class LinearSearchTest {

  int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

  @Test
  void searchElement() {
    int searchResult = LinearSearch.searchElement(arr, 7);
    if (searchResult != -1) {
      System.out.println("Index number:" + searchResult + "  searched value:" + arr[searchResult]);
    } else {
      System.out.println("Searching element has not been founded");
    }
  }

  @Test
  void recSearch() {
    int searchResult1 = LinearSearch.recSearch(arr, 0, arr.length - 1, 7);
    if (searchResult1 != -1) {
      System.out
          .println("Index number:" + searchResult1 + "  searched value:" + arr[searchResult1]);
    } else {
      System.out.println("Searching element has not been founded");
    }

  }

  @Test
  void searchElementNegative() {
    int searchResult = LinearSearch.searchElement(arr, 12);
    if (searchResult != -1) {
      System.out.println("Index number:" + searchResult + "  searched value:" + arr[searchResult]);
    } else {
      System.out.println("Searching element has not been founded");
    }
  }

  @Test
  void recSearchNegative() {

    int searchResult1 = LinearSearch.recSearch(arr, 0, arr.length - 1, 12);
    if (searchResult1 != -1) {
      System.out
          .println("Index number:" + searchResult1 + "  searched value:" + arr[searchResult1]);
    } else {
      System.out.println("Searching element has not been founded");
    }

  }
}