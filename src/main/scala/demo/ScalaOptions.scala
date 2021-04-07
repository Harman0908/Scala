package main.scala.demo

object ScalaOptions {
  val lst = List(1,3, 5 ,7)
  val map = Map(1->"tom", 2->"harry" , 3->"jakson")
  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 3).get)
    println(lst.find(_>8)) // none since return type of find is optional
    println(map.get(1))
    // gives error println(map.get(5)) since value do not exist
    println(map.getOrElse(5, "value do not exist"))

  }
}
