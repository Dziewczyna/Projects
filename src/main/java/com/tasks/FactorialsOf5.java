package com.tasks;

public class FactorialsOf5 {
  public static void main(String[] args) {
    System.out.println(calculateFactorials());
  }

  public static int calculateFactorials() {
    int factorial = 1;
    int[] tabOfInts = new int[5];
    System.out.println("Value of 5! is:");
    for (int i = 0; i <= 4; i++) {
      tabOfInts[i] = i + 1;
      factorial *= tabOfInts[i];
    }
    return factorial;
  }
}
