import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Length of array: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter " + n + " numbers of array: ");
    for (int i = 0; i < n; i++) {
      System.out.print("enter " + (i + 1) + " number: ");
      a[i] = sc.nextInt();
    }

    int sum = 0;
    int[] sumsOfEvenNumbers = new int[n];
    int[] sumsOfDigitsInNumber = new int[n];
    for (int i = 0; i < a.length; i++) {
      String temp = Integer.toString(a[i]);
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
