package scl.dp.coinchange

/**
 * https://www.hackerrank.com/challenges/coin-change
 */
object Solution {
  def main(args: Array[String]): Unit = {
    val n = readLine().split(" ").map(_.toInt).head
    val coins = readLine().split(" ").map(_.toInt).toList
    println(countWays(n, coins))
  }

  def countWays(n: Int, coins: List[Int]): Int = {
    if (n == 0) 1
    else if (n < 0) 0
    else coins match {
      case Nil => 0
      case h :: t => countWays(n - h, coins) + countWays(n, t)
    }
  }
}