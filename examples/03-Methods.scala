
//
// Type inference is not global; in function parameters it is mandatory to use
//

object Module {

  //If the body is only one expression, no further punctuation is necessary. (no {})
  //There is no need for saying `return`, the last expression IS the methods return value.
  def sum(a: Int, b: Int): Int = a + b

  // Multiple Lines require brackets
  def sumWithPrint(a: Int, b: Int) = {
    println(s"a $a y b $b")
    a + b
  }

}
