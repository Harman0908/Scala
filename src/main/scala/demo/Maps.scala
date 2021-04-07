package main.scala.demo

import scala.collection.mutable

object Maps {
    var myMap : Map[Int,String] = Map(1 -> "one" , 2 -> "two")
    val mutableMap : mutable.Map[Int,String] = mutable.Map(1 -> "value 1" , 2->"value2")
  def main(args: Array[String]): Unit = {
   // immutable map
    myMap.keys.foreach(key =>
    println("key : " + key + " value : " + myMap(key))
    )

    println("Map before edit is " + mutableMap)
    // mutable map
    mutableMap += (3 -> "value3 added")

    println("Map After edit is " + mutableMap)
    mutableMap.keys.foreach(key => println("key " + key + " value is " + mutableMap(key)))

    /*
    another way to print this is
    for((k,v) -> mutableMap)
    {
    println(k+ v) }
     */

    // delete  a key
    mutableMap -=(1,2)
    println("map after delete is " + mutableMap)
  }

}
