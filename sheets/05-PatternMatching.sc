

val uno = 1
val lista = List(1,2,3)
val array = Array("a", "b")
val array3 = Array("a", "b", "c")
val string  = "Stringy!"
val string2 = "2"
val tupla2  = (1, "a")
val tupla3  = (1, "a", 2.0)

def doMatch(x: Any): Unit = x match {
  case u: Int           => println("Got an int")
  case l @ List(a,b,c)  => println("Lista de TRES elementos")
  case l @ List(a,b)    => println("Lista de dos elementos ")
  case "Stringy!"       => println("Stringy thingy")
  case Array(a, b )   => println( s"Array con $a, $b")
  case Array(a, b, c)   => println( s"Array con $a, $b, $c")
  case s: String        => println( s"Otro String$s")
  case (int, str)       => println( s"Tupla2 $int, $str")
  case (int, str, dbl)  => println( s"Tupla3 $int, $str, $dbl")
  case _                => println( "No se que me dieron")
}


doMatch(1)

doMatch(uno)

doMatch(array3)

doMatch(lista)

doMatch(array)

doMatch(tupla2)

doMatch(tupla3)

val (a,b,c) = tupla3

