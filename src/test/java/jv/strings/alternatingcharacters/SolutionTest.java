package jv.strings.alternatingcharacters;

import org.junit.Test;

import static jv.strings.alternatingcharacters.Solution.minDeletionCount;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
  @Test
  public void test() {
    assertThat(minDeletionCount("AAAA")).isEqualTo(3);
    assertThat(minDeletionCount("BBBBB")).isEqualTo(4);
    assertThat(minDeletionCount("ABABABAB")).isEqualTo(0);
    assertThat(minDeletionCount("BABABA")).isEqualTo(0);
    assertThat(minDeletionCount("AAABBB")).isEqualTo(4);
    assertThat(minDeletionCount("ABBAAB")).isEqualTo(2);
    assertThat(minDeletionCount("AAB")).isEqualTo(1);
    assertThat(minDeletionCount("AAAABBAAB")).isEqualTo(5);
  }
}