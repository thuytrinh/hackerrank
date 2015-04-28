package scl.search.almostsorted

/**
 * https://www.hackerrank.com/challenges/almost-sorted
 */
object Solution {
  def main(args: Array[String]) {
    readInt()
    val numbers = readLine().split(" ").map(_.toInt)
    println(canSort(numbers))
  }

  def canSort(numbers: Array[Int]): String = {
    if (numbers.length == 2 && numbers.head > numbers.last) {
      "yes\nswap 1 2\n"
    } else {
      var unsortedPairCount = 0
      var firstUnsortedPairIndex = -1
      var finalUnsortedPairIndex = -1

      // -1: We know nothing yet.
      // 0: Likely to be swappable.
      // 1: Likely to be reversible.
      // 2: Nope! Need multiple operations to sort it.
      var prediction = -1
      for (i <- 0 until numbers.length - 1 if prediction != 2) {
        if (numbers(i) > numbers(i + 1)) {
          // We've seen an unsorted pair.
          // What's we gonna do now?
          unsortedPairCount += 1
          if (finalUnsortedPairIndex == -1) {
            // Is that first time ever?
            finalUnsortedPairIndex = i
            firstUnsortedPairIndex = i

            // Narrow the prediction.
            // If it's the only unsorted pair in the array,
            // just swap the pair, then the array is sorted.
            // But there's an exception. For instance, [3,1,2,4].
            // (3,1) is that pair but swapping it helps nothing.
            prediction = 0
          } else if (finalUnsortedPairIndex == i - 1) {
            // We've found yet another unsorted pair
            // standing next to the previous unsorted pair.
            finalUnsortedPairIndex = i
            if (unsortedPairCount == 2) {
              // We've seen only 2 unsorted pairs
              // standing next to each other.
              // Due to problem statement, it's more likely
              // to be swappable than reversible.
              prediction = 0
            } else {
              // Wow! This is a form of desc-sorted sub-array.
              prediction = 1
            }
          } else if (unsortedPairCount == 2) {
            finalUnsortedPairIndex = i
            prediction = 0
          } else {
            prediction = 2
          }
        }
      }

      if (prediction == 0 && firstUnsortedPairIndex > 0) {
        "yes\nswap %d %d\n".format(firstUnsortedPairIndex + 1, finalUnsortedPairIndex + 2)
      } else if (prediction == 1) {
        "yes\nreverse %d %d\n".format(firstUnsortedPairIndex + 1, finalUnsortedPairIndex + 2)
      } else {
        "no\n"
      }
    }
  }
}