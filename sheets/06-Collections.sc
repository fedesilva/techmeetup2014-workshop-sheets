

val l = List(1, 2, 3)

// Transformar
val l2 = l.map( i => i*2 )

// Otra forma _ indica parámetro posicionalmente
val l3 = l.map( _*2 )

val raven =
  """
    |Once upon a midnight dreary, while I pondered, weak and weary,
    |Over many a quaint and curious volume of forgotten lore,
    |While I nodded, nearly napping, suddenly there came a tapping,
    |As of some one gently rapping, rapping at my chamber door.
    |''Tis some visitor,' I muttered, 'tapping at my chamber door-
    |Only this, and nothing more.'
    |
    |Ah, distinctly I remember it was in the bleak December,
    |And each separate dying ember wrought its ghost upon the floor.
    |Eagerly I wished the morrow;- vainly I had sought to borrow
    |From my books surcease of sorrow- sorrow for the lost Lenore-
    |For the rare and radiant maiden whom the angels name Lenore-
    |Nameless here for evermore.
    |
    |
  """.stripMargin


val words = raven.split(" ")

val wordCount = words.groupBy(s => s).mapValues(_.size)

wordCount.foreach( println )

val max = wordCount.maxBy{ case (k,v) => v  }
val maxAgain =
  wordCount
    .filterKeys( _.size > 3 )
    .maxBy{ case (k,v) => v  }





