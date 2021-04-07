package main.scala.demo
/*
Reduce fold scan : each can be used as right or left
 */
object RFS {
    val lst1 = List(1, 2, 3, 4, 5, 6, 7, 8)
    val lst2 = List("Hi", "Hello" , "World")

  def main(args: Array[String]): Unit = {
    println(lst1.reduceLeft(_+_))
    println(lst2.reduceLeft(_+_))
    println(lst1.reduceLeft((x,y) => {println( x +  " , " + y);x+y;}))
  }
}
