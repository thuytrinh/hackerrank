package codility.frog_river_one;

import java.util.HashSet;

/**
 * https://codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
class Solution {
  public int solution(int X, int[] A) {
    // Find the first index that all the positions are filled by leaves.
    // Use a set to check filling. When the size equals to X, returns i.
    // Otherwise, returns -1 at the end.
    final HashSet<Integer> positions = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      positions.add(A[i]);
      if (positions.size() == X) {
        return i;
      }
    }
    return -1;
  }
}
