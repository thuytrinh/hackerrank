package codility.perm_check;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int solution(int[] A) {
    // Elements ranging from 1 to N.
    // Order can be any.
    // One element appears only once.
    if (A == null || A.length == 0) return 0;
    Set<Integer> visits = new HashSet<>();
    for (int e : A) {
      if (visits.contains(e)) {
        // Duplicate found!
        return 0;
      } else {
        visits.add(e);
      }
    }
    for (int i = 1; i <= A.length; i++) {
      if (!visits.contains(i)) {
        // Missing value found!
        return 0;
      }
    }
    return 1;
  }
}