package jv.search.icecreamparlor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor
 */
public class Solution {
  private static final Comparator<int[]> COMPARATOR = new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
      return Integer.compare(o1[0], o2[0]);
    }
  };

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int testCaseCount = in.nextInt();
    in.nextLine();
    for (int i = 0; i < testCaseCount; i++) {
      final int m = in.nextInt();
      in.nextLine();

      final int priceCount = in.nextInt();
      in.nextLine();

      final int[][] prices = new int[priceCount][];
      for (int j = 0; j < priceCount; j++) {
        final int price = in.nextInt();
        prices[j] = new int[]{price, j};
      }

      System.out.println(findPricePair(m, prices));
      in.nextLine();
    }
  }

  static String findPricePair(int m, int[][] prices) {
    Arrays.sort(prices, COMPARATOR);
    final int[] key = new int[1];
    for (int i = 0; i < prices.length; i++) {
      final int firstPrice = prices[i][0];
      final int secondPrice = m - firstPrice;
      key[0] = secondPrice;
      final int secondPriceIndex = Arrays.binarySearch(prices, i + 1, prices.length, key, COMPARATOR);
      if (secondPriceIndex >= 0) {
        final int actualFirstPriceIndex = prices[i][1] + 1;
        final int actualSecondPriceIndex = prices[secondPriceIndex][1] + 1;
        if (actualFirstPriceIndex < actualSecondPriceIndex) {
          return actualFirstPriceIndex + " " + actualSecondPriceIndex;
        } else {
          return actualSecondPriceIndex + " " + actualFirstPriceIndex;
        }
      }
    }

    return "";
  }

  static String test(int m, int[] prices) {
    final int[][] ints = new int[prices.length][];
    for (int i = 0; i < prices.length; i++) {
      ints[i] = new int[]{prices[i], i};
    }
    return findPricePair(m, ints);
  }
}