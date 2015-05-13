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

  def countWays(n: Int, coins: List[Int]): Long = {
    val d = Array.ofDim[Long](coins.length + 1, n + 1)
    (0 to coins.length).foreach(d(_)(0) = 1)

    for (c <- 1 to coins.length; i <- 0 to n) {
      val sub = d(c)(i)
      val coin = coins(c - 1)
      if (i + coin <= n) {
        d(c)(i + coin) = d(c)(i + coin) + sub
      }

      if (i > 0 && c < coins.length) {
        d(c + 1)(i) = d(c + 1)(i) + sub
      }
    }

    // For debugging purpose only.
    // d.foreach(x => println(x.mkString(" ")))

    d(coins.length)(n)
  }
}