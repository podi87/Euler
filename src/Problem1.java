
public class Problem1 {

  public int sumThreeAndFiveBelow(int input) {
    int sum = 0;
    for (int i = 0; i < input; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
