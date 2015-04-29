package scl.ds.swapnodes

/**
 * https://www.hackerrank.com/challenges/swap-nodes-algo
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val nodeCount = readInt()
    val nodes = (0 until nodeCount).map(i => new Node(i + 1, None, None))
    nodes.foreach(n => {
      val childIndices = readLine().split(" ").map(_.toInt)
      if (childIndices(0) != -1)
        n.left = Some(nodes(childIndices(0) - 1))
      if (childIndices(1) != -1)
        n.right = Some(nodes(childIndices(1) - 1))
    })

    val t = readInt()
    (0 until t).map(_ => readInt()).foreach(k => {
      val bottom = nodes.last.depth
      var i = 1
      var h = k
      while (h <= bottom) {
        h = i * k
        i = i + 1
        nodes.filter(n => n.depth == h)
          .foreach(n => n.swap())
      }

      println(nodes.head.toString)
    })
  }
}

class Node(v: Int, l: Option[Node], r: Option[Node]) {
  lazy val depth: Int = parent match {
    case None => 1
    case Some(p) => p.depth + 1
  }

  var value = v
  var parent: Option[Node] = None

  private var _left: Option[Node] = None
  private var _right: Option[Node] = None
  left = l
  right = r

  def left = _left

  def left_=(n: Option[Node]): Unit = {
    _left = n
    _left.foreach(_.parent = Some(this))
  }

  def right = _right

  def right_=(n: Option[Node]): Unit = {
    _right = n
    _right.foreach(_.parent = Some(this))
  }

  /**
   * Prints nodes in inorder traverse.
   */
  override def toString: String = {
    (if (_left.isDefined) s"${_left.get.toString} " else "") +
      value +
      (if (_right.isDefined) s" ${_right.get.toString}" else "")
  }

  def swap(): Unit = {
    val temp = _left
    _left = _right
    _right = temp
  }
}