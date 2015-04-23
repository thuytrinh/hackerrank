package jv.sorting.insertionsort1;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest extends TestCase {
  public void testSort() throws Exception {
    String expected = "2 4 6 8 8\n" +
        "2 4 6 6 8\n" +
        "2 4 4 6 8\n" +
        "2 3 4 6 8\n";
    assertThat(Solution.sort(new int[]{2, 4, 6, 8, 3}))
        .isEqualTo(expected);
  }

  public void testSort2() throws Exception {
    String expected = "3 4 5 6 6\n" +
        "3 4 5 5 6\n" +
        "3 4 4 5 6\n" +
        "3 3 4 5 6\n" +
        "1 3 4 5 6\n";
    assertThat(Solution.sort(new int[]{3, 4, 5, 6, 1}))
        .isEqualTo(expected);
  }
}