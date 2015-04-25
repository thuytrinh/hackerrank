package scl.search.missingnumbers

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testFrequencies") {
    val f = Solution.frequencies(List(1, 1, 2, 3, 3, 3, 3))
    assert(f == Map(1 -> 2, 2 -> 1, 3 -> 4))
  }

  test("testDiff") {
    val diff = Solution.diff(
      List(203, 204, 205, 206, 207, 208, 203, 204, 205, 206),
      List(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204)
    )
    assert(diff == List(204, 205, 206))
  }
}