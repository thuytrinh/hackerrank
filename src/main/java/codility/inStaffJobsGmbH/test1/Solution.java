package codility.inStaffJobsGmbH.test1;

import java.util.Arrays;

class Solution {
  public int solution(int N) {
    // 123 -> 321.
    // 553 -> 553.
    final String s = String.valueOf(N);
    final int[] ints = new int[s.length()];
    for (int i = 0; i < ints.length; i++) {
      ints[i] = Character.getNumericValue(s.charAt(i));
    }
    Arrays.sort(ints);
    int r = 0;
    for (int i = ints.length - 1; i >= 0; i--) {
      r += ints[i] * Math.pow(10, i);
    }
    return r;
  }
}
