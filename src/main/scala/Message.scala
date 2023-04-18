
trait Message {
    def puke(): String
}


class JSONMessage(var obj: HashMap) extends Message {

    def puke(): String = obj
}

class MSGPackMessage(var obj: HashMap) extends Message {

    def puke(): String = obj
}