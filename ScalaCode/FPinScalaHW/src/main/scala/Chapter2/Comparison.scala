package Chapter2

object Comparison {

  def isSorted[A](arr: Array[A], order_function:(A,A) => Boolean): Boolean ={
    val len = arr.length
    @annotation.tailrec
    def loop(n:Int, prev:A, next:A):Boolean ={
      if (n == len - 1) order_function(prev,next)
      else if (!order_function(prev, next)) false
      else loop(n+1, next, arr(n+1))
    }
    if (len <= 1) true
    else loop(1,arr(0),arr(1))
  }

}
