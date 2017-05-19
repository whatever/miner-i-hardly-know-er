package gg.whatever

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "like I give a damn... you know"
}
