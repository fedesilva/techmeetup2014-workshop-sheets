

//Class constructor is the body
abstract class Animal( val name: String ) {
  def vocalization: String
}

//Subclasses pass the constructor parameters to super classes
class Cat( name: String ) extends Animal (name) {
  def vocalization = "Guau"
}

class Dog( name: String ) extends Animal (name) {
  def vocalization = "Miau"
}

// An object is used like a module (replaces statics in Java)
// It has a class but it is the only member.
// It is instantiated the moment it is first de-referenced.
object Animals {

  val kitty = new Cat("Mittens")
  val doggie = new Dog("Butch")

  def all = List(kitty, doggie)

}

val noises = for { animal <- Animals.all } yield animal.vocalization

println( "-" * 50 )
noises.foreach { noise => println(noise) }

println( "-" * 50 )

// Or ..
for { noise <- noises } {
  println(noise)
}




