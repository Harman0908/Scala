package main.scala.demo
/*
functions which are uses one or more variables declared outside the function
 */
object Clousers {
  var number = 10;
val add = (x: Int) => x+number; // add depend on number and its type

  def main(args: Array[String]): Unit = {
    println(add(20))
  }
}
