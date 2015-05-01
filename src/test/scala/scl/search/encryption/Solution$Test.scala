package scl.search.encryption

import org.scalatest.FunSuite

class Solution$Test extends FunSuite {
  test("testEncode") {
    assert(Solution.encode("if man was meant to stay on the ground god would have given us roots") == "imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau")
    assert(Solution.encode("haveaniceday") == "hae and via ecy")
    assert(Solution.encode("feedthedog") == "fto ehg ee dd")
    assert(Solution.encode("chillout") == "clu hlt io")
  }

  test("testGrid") {
    assert(Solution.grid(54) ==(7, 8))
    assert(Solution.grid(80) ==(9, 9))
  }
}