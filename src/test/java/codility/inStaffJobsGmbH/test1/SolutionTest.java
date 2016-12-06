package codility.inStaffJobsGmbH.test1;

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
    assertThat(s.solution(0)).isEqualTo(0);
    assertThat(s.solution(3)).isEqualTo(3);
    assertThat(s.solution(213)).isEqualTo(321);
    assertThat(s.solution(553)).isEqualTo(553);
    assertThat(s.solution(101)).isEqualTo(110);
    assertThat(s.solution(129)).isEqualTo(921);
    assertThat(s.solution(10000)).isEqualTo(10000);
    assertThat(s.solution(11111)).isEqualTo(11111);
  }
}