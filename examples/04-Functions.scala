


// A function is a value, look at the types.
val sum = (a: Int, b: Int) => a + b

// Like with methods, multiple lines need {}. The return value is infered.
val sumWithPrint = (a: Int, b: Int) =>  {
  println(s"a $a y b $b")
  a + b
}

val doble = (a: Int) => a*2

val ns = Seq(1, 2, 3, 4)

ns.map(doble)



