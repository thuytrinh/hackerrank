package scl.ds.swapnodes

import org.scalatest.FunSuite

class NodeTest extends FunSuite {
  test("testNode") {
    val root = new Node(1,
      Some(new Node(2,
        None,
        Some(new Node(4, None, None))
      )),
      Some(new Node(3,
        None,
        Some(new Node(5, None, None))
      ))
    )
    assert(root.toString == "2 4 1 3 5")
    assert(root.depth == 1)
    assert(root.left.get.depth == 2)
    assert(root.right.get.depth == 2)
    root.swap()
    assert(root.toString == "3 5 1 2 4")
  }
}