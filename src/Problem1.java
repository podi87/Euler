
public class Problem1 {


  public static void main(String[] args) {
    System.out.println(sumThreeAndFiveBelow(1000));
  }

  public static int sumThreeAndFiveBelow(int input) {
    int sum = 0;
    for (int i = 0; i < input; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }


}
