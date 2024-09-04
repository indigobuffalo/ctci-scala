package chapters.one

class ContainsDuplicates {
  def hasAllUniqueCharacters(input: String): Boolean = {
    input.toSet.size == input.length
  }
}
