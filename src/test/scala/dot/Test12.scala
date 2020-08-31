package dot

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should

class Test12 extends AnyFlatSpec with Matchers{
  "A table method" should "print table  of 9" in {
    Ques1.table(9) shouldBe (0,9,18,27,36,45,54,63,72,81,90)
  }

  it should "sort elements and multiply max 5 numbers by 5 " in {
   Ques1.max(list(9 to 18))  shouldBe (45,50,55,60,65,14,15,16,17,18)
  }
}
