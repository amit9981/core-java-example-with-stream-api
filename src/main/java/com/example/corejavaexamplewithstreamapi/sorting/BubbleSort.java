package com.example.corejavaexamplewithstreamapi.sorting;

public class BubbleSort {

  public static void bubbleSort(int[] arr) {
    int temp;
    for (int i = 0; i < arr.length; i++) {
//arr.length-i-1 first iteration max value at the end
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

}
