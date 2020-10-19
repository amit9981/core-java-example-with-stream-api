package com.example.corejavaexamplewithstreamapi.interview.number;

public class BinaryToDecimal {

  public static int decimalToBinary(int num){
    final String binaryString = Integer.toBinaryString(num);
    return Integer.parseInt(binaryString);
  }

  public static int binaryToDecimal(int num){
    return Integer.parseInt(String.valueOf(num),2);
  }
}
