package chapters.one

class IsUnique {
  def hasAllUniqueCharacters(input: String): Boolean = {
    val charSet = scala.collection.mutable.HashSet[Char]()
    for (c <- input) {
      if (charSet.contains(c)) return false
      charSet += c
    }
    true
  }
}
