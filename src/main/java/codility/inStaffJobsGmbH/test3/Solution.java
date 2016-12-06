package codility.inStaffJobsGmbH.test3;

import java.util.LinkedList;

import static java.lang.Math.abs;
import static java.lang.Math.min;

class Solution {
  public int solution(int[] A) {
    // return bruteForce(A);
    // return dealWithDuplicates(A);
    // If we find a solution for a sub-problem,
    // how do we find solution for its super problem?
    // Given, A and we got P and Q.
    // Of course, abs(P-Q) is always > 1.
    // How do we find solution for the array A::e?
    // Given eI = indexOf(e).
    // Given a = A[P] + e if abs(eI - P) > 1.
    // Given b = A[Q] + e if abs(eI - Q) > 1.
    // => newSolution = max(A[P]+A[Q], a, b) right?
    int p = 0;
    int q = 2;
    int minI = p;
    int m = A[p] + A[q];
    for (int i = 0; i < 3; i++) {
      if (A[minI] > A[i]) {
        minI = i;
      }
    }
    final int[] ints = {p, q};
    for (int i = q + 1; i < A.length; i++) {
      int a = abs(i - p) > 1 ? (A[p] + A[i]) : Integer.MAX_VALUE;
      int b = abs(i - q) > 1 ? (A[q] + A[i]) : Integer.MAX_VALUE;
      int c = abs(i - minI) > 1 ? (A[minI] + A[i]) : Integer.MAX_VALUE;
      int oldM = m;
      m = min(min(a, c), min(b, m));
      if (m == a && a != oldM) q = i;
      else if (m == b && b != oldM) {
        p = q;
        q = i;
      }
      ints[0] = p;
      ints[1] = q;
      for (int e : ints) {
        if (A[minI] > A[e]) minI = e;
      }
    }
    return m;
  }

  private int bruteForce(int[] A) {
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

  private int dealWithDuplicates(int[] A) {
    int min0 = Integer.MAX_VALUE;
    for (int aA : A) {
      if (min0 > aA) {
        min0 = aA;
      }
    }
    final LinkedList<Integer> is = new LinkedList<>();
    for (int i = 0; i < A.length; i++) {
      if (min0 == A[i]) {
        is.add(i);
      }
    }
    int s = Integer.MAX_VALUE;
    for (int mini0 : is) {
      int min1 = Integer.MAX_VALUE;
      for (int i = 0; i < A.length; i++) {
        if (abs(mini0 - i) > 1) {
          if (min1 > A[i]) {
            min1 = A[i];
          }
        }
      }
      if (s > min0 + min1) {
        s = min0 + min1;
      }
    }
    return s;
  }
}
