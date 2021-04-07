package main.scala.demo

//tuples are immutable in scala
// tuple can store only 22 elements
object Tuples {
  // declaration
  val firstTuple = (1, 2, "3", false)
  // another way
  val secondTuple = new Tuple5(1, 2, 3, "tue", false) // this means 5 elements;
  def main(args: Array[String]): Unit = {
    firstTuple.productIterator.foreach {
      i => println(i)
    }
    println(firstTuple._4 + " This was 4th element of array")
  }
}
