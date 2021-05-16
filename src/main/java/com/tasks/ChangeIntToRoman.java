package com.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeIntToRoman {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = 0;
    try {
      num = scanner.nextInt();
      System.out.println("The number entered by the user: " + num);
    } catch (InputMismatchException e) {
      System.out.println("Wrong format!");
    }
    scanner.close();
    integerToRoman(num);
  }

  public static void integerToRoman(int num) {

    System.out.println("Integer: " + num);
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanLiterals = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    StringBuilder roman = new StringBuilder();

    for (int i = 0; i < values.length; i++) {
      while (num >= values[i]) {
        System.out.println("num: " + num + ", values[" + i + "]=" + values[i]);
        num -= values[i];
        roman.append(romanLiterals[i]);
      }
    }
    System.out.println("Roman: " + roman.toString());
  }
}
