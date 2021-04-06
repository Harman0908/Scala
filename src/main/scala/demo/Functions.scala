package main.scala.demo

object Functions {

  object math {
    def add(x : Int , y : Int) : Int ={
      return x+y
    }
    def square(x : Int) = x*x
  }
  // can or cant write return as last line is considered as return
  def subtract(x : Int , y : Int) : Int ={
     x-y
  }
  def multiply(x : Int , y : Int) : Int = return x*y
  // can avoid return type as it is understood return type will be int
  def divide(x : Int , y : Int)  = x/y

  /*
  default values;
   */
  def some(x : Int = 32 , y : Int = 16) = x+y

  def +(x : Int = 32 , y : Int = 16): Int = x+y



  /*
  Higher Order function
  take functions as arguments and return functions
   */
  def heigherMath(x : Double , y: Double , f:(Double, Double) => Double) : Double ={
  f(x,y);
  }
  def heigherMaththreearguments(x : Double , y: Double ,z :Double, f:(Double, Double) => Double) : Double ={
    f(f(x,y),z);
  }
  def main(args: Array[String]): Unit = {
    // one way
    println(math.add(45,15))
    println(math square 3) // only for single argument ; hence it was used in for loop like 1 to 5
    println(multiply(3, 6))
    println(some());
    println(some(10))
    println(+(12))
    println(10 + 20)

    // anonymous functions

    var add = (x:Int , y:Int) => x+y;
    println(add(200,300))

    var result = heigherMath(50,20,(x,y)=>x+y)
    println(result);
    var res = heigherMath(50,20,(x,y)=> x max y) // similarly for min

    var res1 = heigherMaththreearguments(10,29,9,(x,y)=> x+y)
    println(heigherMaththreearguments(10,29,39,_+_))
  }
}
