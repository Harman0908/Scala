package main.scala.demo
/*
convert multiple argument function to single argument function.
 */
object CurryingFunction {
  // normal functions
  def add(x:Int , y:Int) : Int = x+y
  //currying
  def addSingleArgument(x : Int): Int => Int = (y :Int) => x+y
  /* above function in simple can be written as follow
  def addSingleArgument(x : Int) = (y :Int) => x+y
  */
  // Simple and suggested way to write curried function
  def addSimpleCurriedFunc(x:Int)(y:Int): Int = x+y
  def main(args: Array[String]): Unit ={
    println(addSingleArgument(10)(20))
    //partial + currying i.e fixing one argument
    val fixValue = addSingleArgument(100)// one value has been fixed
    println(fixValue(10))
    // calling the simpler function adds overhead to add wildcard , if willing to call it with single argument.
    val temp = addSimpleCurriedFunc(1000)_ // wildcard added
    println(temp(111))


  }
}
