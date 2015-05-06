package scl.dp.coinchange

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testCountWays") {
    assert(Solution.countWays(5, List(5)) == 1)
    assert(Solution.countWays(4, List(1, 2, 3)) == 4)
    assert(Solution.countWays(5, List(2, 3)) == 1)
    assert(Solution.countWays(5, List(1, 3, 4)) == 3)
    assert(Solution.countWays(5, List(1, 3)) == 2)
    assert(Solution.countWays(10, List(2, 5, 3, 6)) == 5)
  }
}