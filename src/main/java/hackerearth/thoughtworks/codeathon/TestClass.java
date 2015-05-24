package hackerearth.thoughtworks.codeathon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/thoughtworks-singapore-codeathon-2015/algorithm/power-of-two-4/
 */
class TestClass {
  public static void main(String args[]) throws Exception {
    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    final int testCount = Integer.parseInt(reader.readLine());
    for (int i = 0; i < testCount; i++) {
      reader.readLine();
      System.out.println(isPowerOf2(reader.readLine().split(" "))
              ? "YES"
              : "NO"
      );
    }
  }

  static boolean isPowerOf2(String[] a) {
    final int[] numbers = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      numbers[i] = Integer.valueOf(a[i]);
      if (isPowerOf2(numbers[i]))
        return true;
    }

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (isPowerOf2(numbers[i] & numbers[j])) {
          return true;
        }
      }
    }

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        for (int k = j + 1; k < numbers.length; k++) {
          if (isPowerOf2(numbers[i] & numbers[j] & numbers[k])) {
            return true;
          }
        }
      }
    }

    return false;
  }

  static boolean isPowerOf2(int n) {
    return n > 0 && (n & (n - 1)) == 0;
  }
}