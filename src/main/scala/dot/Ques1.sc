class Ques1{
  def table(n:Int): Unit ={
    for(i<-0 to 10){
      println(n*i)
    }
  }
  def max(xs:List[Int]) {
      new:List[Int]=xs.sorted
    for(i<-5 until new.length){
      new.map(new=>new._i * 5)
    }
    println(new)
  }
  def main(args:Array[String]): Unit ={
 val x:List[Int]=(9 to 18).toList
    max(x)

  }
}
val obj=new Ques1()
obj.table(9)