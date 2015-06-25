package scl.strings.pangrams

/**
 * https://www.hackerrank.com/challenges/pangrams
 */
object Solution {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines()
      .map(_.filter(_ != ' ').map(_.toLower).toSet.size)
      .map { case 26 => "pangram" case _ => "not pangram" }
      .foreach(println)
  }
}