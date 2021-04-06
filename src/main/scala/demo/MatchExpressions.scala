package main.scala.demo

object MatchExpressions {
  // similarly can be used as any other switch case
  def main(args: Array[String]): Unit = {
    var age = 180
    age match {
      case 20 => println(age);
      case 18 => println(age);
      case _ => println("Defaults")
    }
    var result = age match {
      case 20 => age;
      case 18 => age;
      case _ => 0
    }
    println("result = " +result)

    var i =7 ;
    i match {
      case 1|3|5|7|9 => println("odd");
      case 2|4|6|8|10 => println("even");
    }
  }
}
