package code

/*

  A sentence sentence is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

  We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

  The rules of Goat Latin are as follows:

  If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
  For example, the word 'apple' becomes 'applema'.

  If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
  For example, the word "goat" becomes "oatgma".

  Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
  For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
  Return the final sentence representing the conversion from sentence to Goat Latin.



 */
/**
  * https://leetcode.com/problems/goat-latin/submissions/
  */
object GoatLatin extends App {

  def toGoatLatin(sentence: String): String = {
    val vowels = Array("A", "E", "I", "O", "U")
    //Aim is to convert to goat latin word
    sentence.split(" ").zipWithIndex.map { tuple =>
      val (word, index) = tuple

      //Check if the first 'char' is a vowel
      val result = if(vowels.exists(_.equalsIgnoreCase(word.substring(0, 1)))){
        s"${word}ma"
      } else {
        s"${word.substring(1, word.length)}${word.substring(0,1)}ma"
      }
      val prependString = (for(_ <- 1 to index+1) yield "a").mkString

      s"$result$prependString"
    }.mkString(" ")
  }

  //Test case
  "I speak Goat Latin"

}
