package Chapter2

object Sequences {

  def factorial(n:Int):Int = {
    @annotation.tailrec
    def loop(n:Int, value:Int):Int ={
      if (n <= 1) value
      else loop(n-1, n*value)
    }
    loop(n, 1)
  }

  def fibonacci(n:Int):Int ={
    @annotation.tailrec
    def loop(n:Int, prev_value:Int, value:Int):Int = {
      if (n < 0) -1
      else if (n==1) value
      else loop(n-1, value, value+prev_value)
    }
    loop(n, 0, 1)
  }

}
