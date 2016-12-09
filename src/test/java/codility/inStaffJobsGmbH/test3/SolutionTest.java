package codility.inStaffJobsGmbH.test3;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
  @Test
  public void isAlwaysTrue() {
    assertThat(true).isTrue();
  }

  @Test
  public void stressTest() {
    final Solution s = new Solution();
    for (int j = 0; j < 1000; j++) {
      int n = 1000;
      final int[] ints = new int[n];
      for (int i = 0; i < ints.length; i++) {
        ints[i] = ThreadLocalRandom.current().nextInt(0, 101);
      }
      assertThat(s.solution(ints))
          .describedAs(Arrays.toString(ints))
          .isEqualTo(s.bruteForce(ints));
    }
  }

  @Test
  public void singleTest() {
    final Solution s = new Solution();
    assertThat(s.solution(new int[]{44, 35, 80, 69, 90, 39, 83, 26, 17, 18}))
        .isEqualTo(44);
  }
}