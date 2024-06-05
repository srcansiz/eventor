package eventor  

import scala.collection.mutable.HashMap

class Eventor(conf: HashMap[String, Any] ) {
    
    val _conf = conf 

    def configuration(): HashMap[String, Any] = _conf
}
