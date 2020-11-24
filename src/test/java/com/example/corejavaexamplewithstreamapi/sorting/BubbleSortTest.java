package com.example.corejavaexamplewithstreamapi.sorting;


import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  //gitThe above function always runs O(n^2)
  @Test
  void bubbleSort() {
    int[] arr={5,7,2,1,9,6};
    System.out.println(Arrays.toString(arr));
    BubbleSort.bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}