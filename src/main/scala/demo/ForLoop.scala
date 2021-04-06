package main.scala.demo

object ForLoop {
  def main(args: Array[String]): Unit = {
    /*
    i = var
    <- generator
    to is function , can also uses as 1.to(5)
     */
    for (i <- 1 to 5){
      println("value of i is " + i)
    }
    for (k <- 1 until  6){
      println("value of k is " + k)
    }
    // nested loops
    for (i <- 1 to 5 ; j <- 1 to 2){
      println(i + " " + j)
    }
    // for loop on list
    var lst = List(1,2,3,4,5,45,56,34,32)
    for(i <- lst) {
        println("i using list" + i)
    }
    //filtering
    for(i <- lst;if i < 6) {
      println("i using FilterList" + i)
    }
    //for loop as expresion
    var result = for{i <- lst;if i < 6} yield{
      i*i
    }
    println("Result" + result)
  }
}
