public class FactorialsOf5 {
  public static void main(String[] args) {
    System.out.println(calculateFactorials());
  }

  public static int calculateFactorials() {
    int fact = 1;
    int[] arr = new int[5];
    System.out.println("Value of 5! is:");
    for (int i = 0; i <= 4; i++) {
      arr[i] = i + 1;
      fact *= arr[i];
    }
    return fact;
  }
}
