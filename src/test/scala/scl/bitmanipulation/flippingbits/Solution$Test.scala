package scl.bitmanipulation.flippingbits

import org.scalatest.FunSuite
import scl.bitmanipulation.flippingbits.Solution.UInt

class Solution$Test extends FunSuite {
  test("testUInt") {
    assert(1L.flip == 4294967294L)
    assert(2147483647L.flip == 2147483648L)
    assert(0L.flip == 4294967295L)
  }
}