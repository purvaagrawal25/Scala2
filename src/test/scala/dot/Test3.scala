package dot

  import org.scalatest.flatspec.AnyFlatSpec
  import org.scalatest.matchers.should.Matchers

  class Test3 extends AnyFlatSpec with Matchers {
    "max_value1" should "find max in the list" in {
      Ques3.max_value1(list) shouldBe 10
    }

    "length" should "find length of list" in {
      Ques3.length(list) shouldBe 10
    }
    "element" should "find n th element from last" in {
      Ques3.element(list) shouldBe 7
    }
    "min_value1" should "find min in the list" in {
      Ques3.min_value1(list) shouldBe 1
    }
  }