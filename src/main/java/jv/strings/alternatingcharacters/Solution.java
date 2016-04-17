package jv.strings.alternatingcharacters;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 */
public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final int testCaseCount = in.nextInt();
    in.nextLine();
    for (int i = 0; i < testCaseCount; i++) {
      final String s = in.nextLine();
      System.out.println(minDeletionCount(s));
    }
  }

  static int minDeletionCount(String s) {
    int consecutiveLen = 1;
    char lastCharOfConsecutiveString = s.charAt(0);
    final int length = s.length();
    for (int i = 0; i < length; i++) {
      final char c = s.charAt(i);
      if (c != lastCharOfConsecutiveString) {
        lastCharOfConsecutiveString = c;
        consecutiveLen++;
      }
    }

    return length - consecutiveLen;
  }
}