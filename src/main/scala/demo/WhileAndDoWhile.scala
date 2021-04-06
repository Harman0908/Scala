package main.scala.demo

// prefix and post fix dont work here
object WhileAndDoWhile {
  def main(args: Array[String]): Unit = {
    var x =0 ;
    while(x < 10) {
      {
        println("X value is " + x)
        x +=1 // x++
      }
    }
    var y =10;
    do{
      println("y value is " + y)
      y -=1 // x++
    } while(y >0);
  }
}
