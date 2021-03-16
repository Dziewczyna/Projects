package com.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many numbers to sum from the Fibonacci sequence? Enter a number: ");
    int amountOfNums = 0;
    try {
      amountOfNums = scanner.nextInt();

      System.out.println("The number entered by the user: " + amountOfNums);
    } catch (InputMismatchException e) {
      System.out.println("Wrong format!");
    }
    scanner.close();
    System.out.println(
        "Sum for " + amountOfNums + " numbers from Fibonnaci sequence: " + sumNumsInFibonacciSeq(amountOfNums));
  }

  public static int sumNumsInFibonacciSeq(int howMany) {
    int[] fibSeq = new int[howMany + 1];
    int sum;
    if (howMany <= 0) sum = 0;

    fibSeq[0] = 0;
    fibSeq[1] = 1;
    sum = fibSeq[0] + fibSeq[1];
    for (int i = 2; i <= howMany; i++) {
      fibSeq[i] = fibSeq[i - 2] + fibSeq[i - 1];

      System.out.println("Sum: " + sum);
      System.out.println(
          "fibSeq["
              + (i - 2)
              + "]= "
              + fibSeq[i - 2]
              + ", fibSeq["
              + (i - 1)
              + "]= "
              + fibSeq[i - 1]);
      sum += fibSeq[i];
    }

    return sum;
  }
}
