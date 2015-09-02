

/**
 * Project Euler #2: Even Fibonacci numbers
 * 
 * @author KishanB
 */
object Solution2 extends App {
  
  io.Source.stdin.getLines().drop(1).map(_.toLong).map(sumOfEvenFibonacciUptoN).foreach(println)
  
  def sumOfEvenFibonacciUptoN(N:Long):Long = {
    fib().takeWhile(_ <= N).filter(_ % 2 == 0).sum
  }
  
  def fib(x:Long = 1, y:Long = 2):Stream[Long] = {
    x #:: fib(y, x + y)
  }
  
}