package scl.graphtheory.eventree

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testNodeCount") {
    val root = new Node(1)
    root.children ++= List(new Node(2), new Node(3))
    assert(root.count == 3)
  }
}