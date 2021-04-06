package main.scala.demo

object IfElse {
  def main(args: Array[String]): Unit = {
    val x = 20;
    if(x == 20){
      println("X is 20")
    }
    else
      println("X is unknown")

    val res2 = if(x==20) "x == 20" else "x != 20"
    println(res2)
  }
}
// expressions are completely same as that of other languages.
/* And &&
Or ||
greater than and less than is completely same.
 */