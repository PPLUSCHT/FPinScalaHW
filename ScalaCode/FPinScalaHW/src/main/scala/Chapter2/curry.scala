package Chapter2

object curry {
  def currier[A,B,C](f: (A,B) =>C): A=>B=>C ={
    a:A => b:B => f(a,b)
  }
  def uncurrier[A,B,C](f: A => B => C): (A,B) => C ={
    (a:A, b:B) => f(a)(b)
  }
  def compose[A,B,C](f: B => C, g: A => B): A => C ={
    (a:A) => f(g(a))
  }
}
