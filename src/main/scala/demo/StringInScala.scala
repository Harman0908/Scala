package main.scala.demo

object StringInScala {

  val str1 : String= "Hello"
  val str2 : String= "World"
  val value1 = 100
  val value2 = 30.245
  def main(args: Array[String]): Unit = {
    var result1 = str1+str2
    var result2 = str1.concat(str2)
    var result3: Unit = printf("%d %f %s %s" , value1, value2, str1, str2) // this will work as function now.
    printf("\n%d %f %s %s" , value1, value2, str1, str2) // normal print
    println("\n%d %f %s %s".format(value1,value2,str1,str2)) // using format function
    println("result 1 : "+result1 +"\n result 2 :" + result2 +"\n result 3" + result3)

  }
}
