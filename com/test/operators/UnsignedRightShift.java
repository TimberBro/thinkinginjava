package com.test.operators;

public class UnsignedRightShift {
  public static void main(String[] args) {
    int x = 0xFF;
    System.out.println("Before left shift");
    System.out.println(Integer.toBinaryString(x));
    x <<= 2;
    System.out.println("After left shift");
    System.out.println(Integer.toBinaryString(x));
    System.out.println("Start unsigned right shifting");
    for (int i = 0; i < 12; i++){
      x >>>= 1;
      System.out.println(Integer.toBinaryString(x));
    }
  }
}
