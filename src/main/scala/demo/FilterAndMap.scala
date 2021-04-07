package main.scala.demo

object FilterAndMap {
  val lst = List(1,3, 5 ,7,10)
  val map = Map(1->"tom", 2->"harry" , 3->"jakson")

  def main(args: Array[String]): Unit = {
    println(lst.map(_*2))
    println(lst.map(x => x*3))
    println(map.map(x => x + "hi"))
    println(List(List(1,2,3) , List(4,5,6)))
    println(List(List(1,2,3) , List(4,5,6)).flatten)
    println(lst.flatMap(x => List(x,x*4)))
    println(lst.map(x => List(x,x*4)))
    //even value
    println(lst.filter(x=> x%2==0))

  }
}
