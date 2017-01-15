package example;

import example.Intrinsic;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < 1e7; ++i) {
      int result = Intrinsic.sum(5, 6);
      if (result != 11) {
        throw new IllegalArgumentException(Integer.toString(result));
      }
    }
  }
}
