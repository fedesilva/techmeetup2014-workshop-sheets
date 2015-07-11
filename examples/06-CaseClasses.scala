//
//  Case classes are an important feature of the language.
//  We use normal classes very infrequently, case classes are enough, easier to use,
//  immutable by default and the compiler synthetizes some utilities for us.
//  Case classes as the name indicates are usable in match expressions.
//

// Define Persona. All members are externally visible and immutable.
case class Persona(name: String, age: Int)

val p = Persona("pepe", 25)

println( p.name )

val name = p match {
  case Persona(n, a) => n
}

// deconstruction on assignement
val Persona(n, a) = p

