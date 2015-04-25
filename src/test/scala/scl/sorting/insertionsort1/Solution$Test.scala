package scl.sorting.insertionsort1

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testSort1") {
    val expected =
      "3 4 5 6 6\n" +
        "3 4 5 5 6\n" +
        "3 4 4 5 6\n" +
        "3 3 4 5 6\n" +
        "1 3 4 5 6\n"
    var actual = ""
    Solution.sort(Array(3, 4, 5, 6, 1), state => {
      actual += state.mkString(" ") + "\n"
    })
    assert(actual == expected)
  }

  test("testSort2") {
    val expected =
      "2 4 6 8 8\n" +
        "2 4 6 6 8\n" +
        "2 4 4 6 8\n" +
        "2 3 4 6 8\n"
    var actual = ""
    Solution.sort(Array(2, 4, 6, 8, 3), state => {
      actual += state.mkString(" ") + "\n"
    })
    assert(actual == expected)
  }
}