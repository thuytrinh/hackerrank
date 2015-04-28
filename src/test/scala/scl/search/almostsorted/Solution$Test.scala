package scl.search.almostsorted

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testCanSort1") {
    assert(Solution.canSort(List(4, 2)) == "yes\nswap 1 2\n")
  }

  test("testCanSort2") {
    assert(Solution.canSort(List(3, 1, 2)) == "no\n")
  }

  test("testCanSort3") {
    assert(Solution.canSort(List(1, 5, 4, 3, 2, 6)) == "yes\nreverse 2 5\n")
  }

  test("testCanSort4") {
    assert(Solution.canSort(List(1, 2, 10, 4, 7, 8, 3, 12, 14)) == "yes\nswap 3 7\n")
  }
}