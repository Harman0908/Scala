package main.scala.demo

object Arrays {
  val myArray  = new Array[Int](5)
  def main(args: Array[String]): Unit = {
    myArray(0) = 1
    myArray(1) = 10
    myArray(2) = 112
    myArray(3) = 1102
    myArray(4) = 12222
    for(x<- myArray){
      println(x)
    }
    for(i <- 0 to myArray.length -1)
      {
        println(myArray(i))
      }
  }
}
