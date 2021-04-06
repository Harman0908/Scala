package main.scala.demo

import java.util.Date

object PartialAppliedFunction {

  def log(date : Date,message : String): Unit = {
    println(date + "  " + message)
  }
  def main(args: Array[String]): Unit = {
    val sum = (a:Int,b:Int,c:Int) => a+b+c
    //fully functional
    println(sum(10,20,30))
    //partial function
   val f = sum(10,20,_:Int)
    println(f(100))

    // create partial function for log
    val date = new Date;
    val newLog = log(date,_:String);
    newLog("The message 1")

  }
}
