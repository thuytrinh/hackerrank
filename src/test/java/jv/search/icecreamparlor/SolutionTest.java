package jv.search.icecreamparlor;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
  @Test
  public void test() {
    assertThat(Solution.test(4, new int[]{1, 4, 5, 3, 2})).isEqualTo("1 4");
    assertThat(Solution.test(4, new int[]{2, 2, 4, 3})).isEqualTo("1 2");
    assertThat(Solution.test(4, new int[]{2, 2, 2, 4, 3})).isEqualTo("1 2");

    final int[] prices = new int[10000];
    for (int i = 0; i < prices.length; i++) {
      prices[i] = prices.length - i;
    }
    assertThat(Solution.test(10001, prices)).isEqualTo("1 10000");
  }
}