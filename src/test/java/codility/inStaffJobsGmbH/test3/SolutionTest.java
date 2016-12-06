package codility.inStaffJobsGmbH.test3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
  @Test
  public void isAlwaysTrue() {
    assertThat(true).isTrue();
  }

  @Test
  public void test() {
    final Solution s = new Solution();
    assertThat(s.solution(new int[]{5, 2, 4, 6, 3, 7})).isEqualTo(5);
    assertThat(s.solution(new int[]{2, 2, 1, 6, 3, 7})).isEqualTo(3);
    assertThat(s.solution(new int[]{2, 2, 1, 0, 3, 7})).isEqualTo(2);
    assertThat(s.solution(new int[]{2, 2, 0, 1, 1, 7})).isEqualTo(1);
    assertThat(s.solution(new int[]{1, 0, 2, 1, 5, 7})).isEqualTo(1);
    assertThat(s.solution(new int[]{2, 0, 0, 3, 4})).isEqualTo(2);
    assertThat(s.solution(new int[]{3, 0, 0, 2, 4})).isEqualTo(2);
    assertThat(s.solution(new int[]{0, 0, 2, 4, 2})).isEqualTo(2);
    assertThat(s.solution(new int[]{0, 0, 0, 0, 2})).isEqualTo(0);
  }
}