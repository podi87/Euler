
public class Problem2 {

  public long fiboancci(int n){
    if (n <= 0) {
      return 0;
    }
    else if (n == 1) {
      return 1;
    }
    else {
      return fiboancci(n - 1) + fiboancci(n - 2);
    }
  }

  public long fibonacciEvenSum(int n) {
    int temp = 1;
    int sum = 0;
      while (fiboancci(temp) < n) {
        if(fiboancci(temp) % 2 == 0) {
          sum += fiboancci(temp);
        }
        temp++;
      }
    return sum;
  }
}