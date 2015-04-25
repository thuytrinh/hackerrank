package scl.warmup.maximizingxor

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testFindMaxXor") {
    assert(Solution.findMaxXor(List(10, 15)) == 7)
  }
}