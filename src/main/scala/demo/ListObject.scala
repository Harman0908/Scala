package main.scala.demo

object ListObject
{
  val myList : List[Int] = List(1,2,4,5,7,9,0)
  val names : List[String] = List("My","Object","Class")
  def main(args: Array[String]): Unit = {
    println(0 :: myList)
    println(myList)
    println(Nil)
    println(1 :: 5 :: 8 :: Nil) // append for ::
    println(myList.head)
    println(myList.tail)
    println(myList.isEmpty)
    println(List.fill(5)(2)) // list with 5 time 2
    myList.foreach(println)

    var sum : Int = 0
    myList.foreach(sum += _);
    println(sum)



    for(name <- names){
      print(" " +name)
    }
  }
}
