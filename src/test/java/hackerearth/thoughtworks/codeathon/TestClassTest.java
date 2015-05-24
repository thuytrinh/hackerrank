package hackerearth.thoughtworks.codeathon;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestClassTest {
  @Test
  public void test1() throws Exception {
    assertTrue(TestClass.isPowerOf2(new String[]{"1", "2", "3"}));
    assertFalse(TestClass.isPowerOf2(new String[]{"0", "1000000000"}));
    assertTrue(TestClass.isPowerOf2(new String[]{"9", "10", "3"}));
    assertTrue(TestClass.isPowerOf2(new String[]{"8"}));
    assertFalse(TestClass.isPowerOf2(new String[]{"15", "9"}));
  }

  @Test
  public void test2() throws Exception {
    assertFalse(TestClass.isPowerOf2(new String[]{"10", "20"}));
  }
}