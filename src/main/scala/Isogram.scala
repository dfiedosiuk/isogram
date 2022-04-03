object Isogram extends App {

  def check(word: String): Boolean ={
    val signs = word
      .toLowerCase
      .toList
      .filter(('a'to'z').contains)
    if (signs == signs.distinct) true
    else false
  }

}
