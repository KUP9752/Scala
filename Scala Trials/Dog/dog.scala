case class Dog(name:String, breed: String)

object Dog {
  def main(args: Array[String]): Unit = {
    val d1 = Dog("Scooby", "Doberman")
    println(d1.toString)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println("main")
  }
}