package codility.inStaffJobsGmbH.test2;

class Solution {
  public int solution(int A, int B) {
    final String sA = String.valueOf(A);
    final String sB = String.valueOf(B);
    final StringBuilder sb = new StringBuilder();
    int i = 0;
    int j = 0;
    while (!(i >= sA.length() && j >= sB.length())) {
      if (i < sA.length()) {
        sb.append(sA.charAt(i));
        i++;
      }
      if (j < sB.length()) {
        sb.append(sB.charAt(j));
        j++;
      }
    }
    long r;
    try {
      r = Long.parseLong(sb.toString());
    } catch (Exception e) {
      return -1;
    }
    return r > 100000000 ? -1 : (int) r;
  }
}
