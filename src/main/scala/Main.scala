import scala.collection.mutable.HashMap
import eventor.Eventor
import events.Number

var conf: HashMap[String, Any] = HashMap(
  "type" -> "event"
)

val e: Eventor = new Eventor(conf=conf)


@main def hello: Unit =
  println("Hello world!")
  println(e.configuration())

def msg = "I was compiled by Scala 3. :)"
