class Ques3{
  def main(args:Array[String]): Unit ={
    val list:List[Int]=(1,2,3,4,5,6,7,8,9,10)
   println( max_value1(list))
   val  res=length(list)
    if(res==0)println("empty") else println(res)
    val n=3
    element(list,res,n)
  }

  def max_value1(xs:List[Int]):Any ={
    match xs with
    {
      case Nil => println("Empty List")
      case head :: Nil => head
      case (x :: y :: xs) => if (x < y)  max_value1(y :: xs)
      else max_value1(x :: xs)
    }
  }

  def length(list: List[Int]): Int = {
    list match {
case Nil=>0
case l=>l.length
    }
  }

  def min_value1(xs:List[Int]):Any ={
    match xs with
    {
      case Nil => println("Empty List")
      case head :: Nil => head
      case (x :: y :: xs) => if (x > y)  min_value1(y :: xs)
      else min_value1(x :: xs)
    }
  }

  def element(xs: List[Int],len:Int,n:Int): Int = {
xs match{
  case Nil=>println("empty list")
  case x=>if(n>len) println("not possible")
  case _=>println(xs[len-n])
}
  }

}
