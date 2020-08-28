
class Assign {
  def isprime(i: Int): Boolean =
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 until i).exists(n => i % n == 0)

  def gcd(x: Int, y: Int): Int = {
    if (x == 0) y
    else if (y == 0) x
    else if (x < y) gcd(x, y - x)
    else gcd(x - y, y)
  }
}
val obj=new Assign()
obj.isprime(11)
obj.gcd(5,10)
