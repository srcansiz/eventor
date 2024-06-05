
import scala.collection.mutable.HashMap
import org.json4s.native.Json
import org.json4s.DefaultFormats

import eventor.Eventor

trait Message:
    def puke(): String



class JSONMessage(var obj: HashMap[String, Any]) extends Message {
    
    def puke(): String = Json(DefaultFormats).write(obj)
}

class MSGPackMessage(var obj: HashMap[String, Any]) extends Message {

    def puke(): String = Json(DefaultFormats).write(obj)
}