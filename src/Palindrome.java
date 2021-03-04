import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    String word = "";
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word, we will check if it is palindrome: ");
    try {
      word = sc.nextLine();
      System.out.println("Entered word: " + word);
    } catch (InputMismatchException e) {
      System.out.println("Wrong format!");
    }
    sc.close();
    if (isWordAPalindrome(word)) System.out.println("This word is a palindrome");
    else System.out.println("This word is not a palindrome");
  }

  public static boolean isWordAPalindrome(String word) {
    word = word.toLowerCase();
    StringBuilder sbWord = new StringBuilder(word);
    StringBuilder sbReverse = sbWord.reverse();
    return (sbReverse.toString()).equals(word);
  }
}
