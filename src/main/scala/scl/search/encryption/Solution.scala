package scl.search.encryption

/**
 * https://www.hackerrank.com/challenges/encryption
 */
object Solution {
  def main(args: Array[String]): Unit = {
    println(encode(readLine()))
  }

  def encode(s: String): String = {
    val noSpaces = s.replace(" ", "")
    val g = grid(noSpaces.length)
    (0 until g._2).map(c => {
      (0 until g._1)
        .map(r => c + r * g._2)
        .filter(i => i < noSpaces.length)
        .map(i => noSpaces.charAt(i))
        .mkString
    }).mkString(" ")
  }

  def grid(n: Int): (Int, Int) = {
    val s = Math.sqrt(n)
    val lower = Math.floor(s).toInt
    val upper = Math.ceil(s).toInt
    (lower to upper)
      .flatMap(l => (l to upper).map(u => (l, u)))
      .filter(p => p._1 * p._2 >= n)
      .head
  }
}