package com.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeRomanToInt {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a roman number: ");
    String romanLiteral = "";
    try {
      romanLiteral = scanner.nextLine();

      System.out.println("The number entered by the user: " + romanLiteral);
    } catch (InputMismatchException e) {
      System.out.println("Wrong format!");
    }
    scanner.close();
    System.out.println("And that roman to int: " + romanToInteger(romanLiteral));
  }

  public static int romanToInteger(String roman) {
    if (roman == null
        || roman.isEmpty()
        || !roman.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
      // return -1;
      throw new IllegalArgumentException("Wrong roman literal!");

    final Matcher matcher = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I").matcher(roman);
    final int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    final String[] romanNumerals = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    int result = 0;

    while (matcher.find())
      for (int i = 0; i < romanNumerals.length; i++)
        if (romanNumerals[i].equals(matcher.group(0))) result += decimalValues[i];

    return result;
  }
}
