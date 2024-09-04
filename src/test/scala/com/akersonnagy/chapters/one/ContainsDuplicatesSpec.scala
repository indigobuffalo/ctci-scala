package chapters.one

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ContainsDuplicatesSpec extends AnyFlatSpec with Matchers {

  "IsUnique" should "return true for a string with all unique characters" in {
    val checker = new ContainsDuplicates
    checker.hasAllUniqueCharacters("abcdefg") should be (true)
  }

  it should "return false for a string with duplicate characters" in {
    val checker = new ContainsDuplicates
    checker.hasAllUniqueCharacters("hello") should be (false)
  }
}
