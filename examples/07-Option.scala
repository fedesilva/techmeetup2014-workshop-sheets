
object Data {

  def getData(i: Int): Option[String] = {
    if (i < 10 )
      Some(s"Es un ${i.toString}")
    else
      None
  }

  getData(1) match {
    case Some(s)  => println(s)
    case None     => println("None")
  }

  getData(11) match {
    case Some(s)  => println(s)
    case None     => println("None")
  }

}

getData(1).map(_.toUpperCase).getOrElse("Naranjas")
getData(10).map(_.toUpperCase).getOrElse("Naranjas")

getData(1)
  .map{ str => str.reverse}
  .foreach(println)

