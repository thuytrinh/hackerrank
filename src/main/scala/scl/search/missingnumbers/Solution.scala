package scl.search.missingnumbers

import scala.collection.mutable

/**
 * https://www.hackerrank.com/challenges/missing-numbers
 */
object Solution {
  def main(args: Array[String]) {
    readInt()
    val a = readLine().split(" ").map(_.toInt).toList
    readInt()
    val b = readLine().split(" ").map(_.toInt).toList
    println(diff(a, b).mkString(" "))
  }

  def diff(a: List[Int], b: List[Int]): List[Int] = {
    val aFrequencies = frequencies(a)
    val bFrequencies = frequencies(b)
    val missing = mutable.Set[Int]()
    for ((element, bFrequency) <- bFrequencies) {
      val aFrequency = aFrequencies.getOrElse(element, 0)
      if (aFrequency != bFrequency) {
        missing += element
      }
    }
    missing.toList.sorted
  }

  def frequencies(list: List[Int]): mutable.Map[Int, Int] = {
    val r = mutable.HashMap[Int, Int]()
    list.foreach(x => {
      r(x) = r.getOrElse(x, 0) + 1
    })
    r
  }
}