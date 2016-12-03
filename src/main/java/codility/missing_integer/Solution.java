package codility.missing_integer;

import java.util.HashSet;

/**
 * https://codility.com/programmers/lessons/4-counting_elements/missing_integer/start/
 */
class Solution {
  public int solution(int[] A) {
    final HashSet<Integer> visits = new HashSet<>();
    int max = 0;
    for (int e : A) {
      visits.add(e);
      if (max < e) max = e;
    }
    for (int i = 1; i <= max; i++) {
      if (!visits.contains(i))
        return i;
    }
    return max + 1;
  }
}