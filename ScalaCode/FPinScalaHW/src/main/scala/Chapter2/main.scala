package Chapter2

import Chapter2.curry._
import Chapter2.Sequences._
import Chapter2.Comparison._

object main {
  def main(args:Array[String]): Unit ={

    //Factorial and Fibonacci Test
    println("\n\n Sequences Test\n\n")
    println(factorial(10))
    println(fibonacci(10))

    //isSorted Test
    println("\n\n Sorted Test\n\n")
    println(isSorted[Int](Array(1,2,3,4,5,6,5),(x:Int,y:Int) => x< y))
    println(isSorted[Int](Array(1,2,3,4,5,6),(x:Int,y:Int) => x< y))

    //Currying Test
    println("\n\n Currying Test\n\n")
    val f = (x:Int, y:Int) => x+x*y
    println(f(10,12))
    val curried = currier[Int, Int, Int](f)
    println(curried(10)(12))
    val uncurried = uncurrier[Int, Int, Int](curried)
    println(uncurried(10,12))

    //Composition Test
    println("\n\n Composition Test\n\n")
    val h = (x:Int) => "Hello, the answer is " + (10 * x + x).toString
    val g = (y:Float) => (y/2).toInt
    val composition = compose[Float, Int, String](h,g)
    println(composition(11.2.toFloat))
  }
}
