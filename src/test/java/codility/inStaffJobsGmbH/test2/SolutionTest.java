package codility.inStaffJobsGmbH.test2;

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
    assertThat(s.solution(12, 56)).isEqualTo(1526);
    assertThat(s.solution(56, 12)).isEqualTo(5162);
    assertThat(s.solution(12345, 678)).isEqualTo(16273845);
    assertThat(s.solution(123, 67890)).isEqualTo(16273890);
    assertThat(s.solution(1234, 0)).isEqualTo(10234);
    assertThat(s.solution(100000000, 100000000)).isEqualTo(-1);
    assertThat(s.solution(0, 0)).isEqualTo(0);
    assertThat(s.solution(0, 123)).isEqualTo(123);
    assertThat(s.solution(12, 34)).isEqualTo(1324);
  }
}