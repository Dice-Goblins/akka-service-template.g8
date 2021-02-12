package $package$

import $package$.actors.Guardian
import akka.actor.typed.ActorSystem
import $package$.utils.JsonSupport

object Server extends App with JsonSupport {
  val system = ActorSystem[Nothing](Guardian(), "hello-akka")
}
