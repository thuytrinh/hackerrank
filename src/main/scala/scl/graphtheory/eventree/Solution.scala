package scl.graphtheory.eventree

import scala.collection.immutable.IndexedSeq
import scala.collection.mutable.ArrayBuffer

/**
 * https://www.hackerrank.com/challenges/even-tree
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val counts = readLine().split(" ").map(_.toInt)
    val nodes = (0 until counts.head).map(i => new Node(i + 1))
    (0 until counts.last)
      .map(_ => readLine().split(" ").map(_.toInt))
      .foreach(p => {
      val child = nodes(p.head - 1)
      val parent = nodes(p.last - 1)
      parent.children += child
    })
    println(countBreakableEdges(nodes))
  }

  /**
   * The number of breakable edges is the number of sub-trees
   * having even count of nodes.
   */
  def countBreakableEdges(nodes: IndexedSeq[Node]): Int = {
    // Note that we don't count the root.
    nodes.tail.count(n => n.count % 2 == 0)
  }
}

class Node(v: Int) {
  lazy val count: Int = 1 + children.map(_.count).sum
  var value = v
  var parent: Option[Node] = None
  var children = new ArrayBuffer[Node]()
}