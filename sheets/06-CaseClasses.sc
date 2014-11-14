
// Es como un struct
case class Persona(nombre: String, age: Int)

val p = Persona("pepe", 25)

val name = p match {
  case Persona(n,e) => n
}

// deconstruye y asigna
val Persona(nombre,  edad) = p

