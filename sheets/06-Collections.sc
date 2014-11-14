


// Un value! Mirá el tipo.
val sum = (a: Int, b: Int) => a + b

// Multiples líneas llevan {}, return inferido
val sumWithPrint = (a: Int, b: Int) =>  {
  println(s"a $a y b $b")
  a + b
}


val doble = (a: Int) => a*2

val ns = Seq(1, 2, 3, 4)

ns.map(doble)
