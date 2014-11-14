

abstract class Animal( val name: String ) {
  def makeNoise: String
}

class Cat( name: String ) extends Animal (name) {
  def makeNoise = "Guau"
}

class Dog( name: String ) extends Animal (name) {
  def makeNoise = "Miau"
}

object Animals {

  val kitty = new Cat("Mittens")
  val doggie = new Dog("Butch")

  def all = List(kitty, doggie)

}

val noises = for { animal <- Animals.all }
yield animal.makeNoise

println( "-" * 50 )
noises.foreach { noise => println(noise) }

println( "-" * 50 )

// o si no
for { noise <- noises } {
  println(noise)
}




