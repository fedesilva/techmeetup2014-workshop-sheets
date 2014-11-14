
object Thing {

  def sum(a: Int, b: Int): Int = a + b

  // Multiples líneas llevan {}, return inferido
  def sumWithPrint(a: Int, b: Int) = {
    println(s"a $a y b $b")
    a + b
  }

}