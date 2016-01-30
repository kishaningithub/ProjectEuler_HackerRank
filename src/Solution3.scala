

/**
 * Project Euler #3: Largest prime factor
 * 
 * @author KishanB
 */
object Solution3 extends App 
{
  io.Source.stdin.getLines().drop(1).map(_.toLong).map(largestPrimeFactor).foreach(println)
  
  def largestPrimeFactor(N:Long):Long = {
    val primeFactor = (2L to math.sqrt(N).toLong).find(N % _ == 0)
    primeFactor match {
      case Some(i) => largestPrimeFactor(N / i)
      case None => N
    }
  }
}