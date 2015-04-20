package java.warmup.solvemefirst;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest extends TestCase {
  public void testSolveMeFirst() throws Exception {
    assertThat(Main.solveMeFirst(2, 3)).isEqualTo(5);
  }
}