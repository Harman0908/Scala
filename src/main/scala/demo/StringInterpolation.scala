package main.scala.demo
object StringInterpolation {
  def main(args: Array[String]): Unit = {
    val name = "mark"
    val age = 18
    println("First Program")
    println(name + " is " + age + " years old")
    println(s"$name is $age years old ,Not Type Safe")
    println(f"$name%s is $age%d years old ,Type Safe")
   /* println("Hello \n World")
    println(raw"Hello \n World")*/
  }
}
