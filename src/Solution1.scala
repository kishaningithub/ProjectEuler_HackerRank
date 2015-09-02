

/**
 * Project Euler #1: Multiples of 3 and 5
 * 
 * @author KishanB
 */
object Solution1 extends App 
{
   io.Source.stdin.getLines().drop(1).map(x => x.toLong).map(sumOfMultiplesOf3And5).foreach(println)
   
   def sumOfMultiplesOf3And5(N:Long):Long = {
    (1L until N).filter(x => x % 3 == 0 || x % 5 == 0).sum
   }
}