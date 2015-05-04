package scl.combinatorics.strangegrid

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testFindValue") {
    assert(Solution.findValue(Array(6, 3)) == 25)
    assert(Solution.findValue(Array(4, 4)) == 17)
    assert(Solution.findValue(Array(5, 1)) == 20)
    assert(Solution.findValue(Array(1, 1)) == 0)
  }
}