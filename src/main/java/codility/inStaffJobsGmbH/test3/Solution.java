package codility.inStaffJobsGmbH.test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.abs;

class Solution {
  public int solution(int[] A) {
    // Takes O(1) for both time and space complexities.
    return faster(A);
  }

  private int faster(final int[] A) {
    // Find indices of 4 smallest elements.
    final Set<Integer> visits = new HashSet<>();
    while (visits.size() < 4) {
      int e = -1;
      for (int i = 0; i < A.length; i++) {
        if (!visits.contains(i)) {
          if (e == -1 || A[e] > A[i]) {
            e = i;
          }
        }
      }
      visits.add(e);
    }
    final List<Integer> indices = new ArrayList<>(visits);

    // Pick non-adjacent pair which forms minimal sum.
    int minSum = Integer.MAX_VALUE;
    for (int i = 0; i < indices.size(); i++) {
      for (int j = i + 1; j < indices.size(); j++) {
        if (abs(indices.get(i) - indices.get(j)) > 1) {
          int s = A[indices.get(i)] + A[indices.get(j)];
          if (minSum > s) minSum = s;
        }
      }
    }
    return minSum;
  }

  /**
   * To perform stress-tests only.
   */
  int bruteForce(int[] A) {
    int m = Integer.MAX_VALUE;
    for (int i = 0; i < A.length; i++) {
      for (int j = i + 2; j < A.length; j++) {
        if (A[i] + A[j] < m) {
          m = A[i] + A[j];
        }
      }
    }
    return m;
  }
}
