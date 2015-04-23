package jv.sorting.insertionsort1;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    in.nextInt();
    in.nextLine();

    String[] strings = in.nextLine().split(" ");
    int[] ints = new int[strings.length];
    for (int i = 0; i < ints.length; i++) {
      ints[i] = Integer.parseInt(strings[i]);
    }

    System.out.print(sort(ints));
  }

  static String sort(int[] ints) {
    // Grab v before shifting.
    int v = ints[ints.length - 1];
    String states = "";
    for (int i = ints.length - 2; i >= 0; i--) {
      if (ints[i] > v) {
        // Shift to the right.
        ints[i + 1] = ints[i];
        if (i == 0) {
          states += toString(ints) + "\n";

          // Can't go further to the left.
          // Time to place v.
          ints[0] = v;
        }

        states += toString(ints) + "\n";
      } else {
        ints[i + 1] = v;
        if (i != ints.length - 2) {
          // This is an actual shift.
          states += toString(ints) + "\n";
        }

        break;
      }
    }

    return states;
  }

  static String toString(int[] ints) {
    String s = "";
    for (int i = 0; i < ints.length; i++) {
      s += i != ints.length - 1
          ? ints[i] + " "
          : Integer.valueOf(ints[i]);
    }

    return s;
  }
}