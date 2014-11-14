

val uno = 1
val lista = List(1,2,3)
val array = Array("a", "b")
val array2 = Array("a", "b", "c")
val string  = "Stringy!"
val string2 = "2"

def doMatch(x: Any): Unit = x match {
  case u: Int           => println("Got an int")
  case l @ List(a,b)    => println("Lista de dos elementos ")
  case l @ List(a,b,c)  => println("Lista de TRES elementos")
  case "Stringy!"       => println("Stringy thingy")
  case Array(a, b )   => println( s"Array con $a, $b")
  case Array(a, b, c)   => println( s"Array con $a, $b, $c")
  case s: String        => println( s"Otro String$s")
  case _                => println( "No se que me dieron")
}


doMatch(1)
doMatch(uno)
doMatch(lista)
doMatch(array2)
doMatch(array)

