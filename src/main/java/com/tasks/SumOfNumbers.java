package com.tasks;

import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Length of array: ");
    int arrLength = scanner.nextInt();
    int[] arrNums = new int[arrLength];
    System.out.println("Enter " + arrLength + " numbers of array: ");
    for (int i = 0; i < arrLength; i++) {
      System.out.print("enter " + (i + 1) + " number: ");
      arrNums[i] = scanner.nextInt();
    }

    int sum = 0;
    int[] sumsOfEvenNumbers = new int[arrLength];
    int[] sumsOfDigitsInNumber = new int[arrLength];
    for (int i = 0; i < arrNums.length; i++) {
      String temp = Integer.toString(arrNums[i]);
      int[] newGuess = new int[temp.length()];
      for (int j = 0; j < temp.length(); j++) {
        newGuess[j] = temp.charAt(j) - '0';
        System.out.println(temp.charAt(j) - '0');
        if (j % 2 == 1) {

          sumsOfEvenNumbers[i] += newGuess[j];
        }
        sumsOfDigitsInNumber[i] += newGuess[j];
      }

      System.out.println("sumsOfEvenNumbers[" + i + "]: " + sumsOfEvenNumbers[i]);
      System.out.println("sumsOfDigitsInNumber[" + i + "]: " + sumsOfDigitsInNumber[i]);
      sum += sumsOfEvenNumbers[i];
    }
    System.out.println("Sum of sums of even numbers: " + sum);
  }
}
