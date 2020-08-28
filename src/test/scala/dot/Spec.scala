package dot
import org.scalatest._
import org.scalatest.matchers.should.Matchers
class Spec extends AnyFlatSpec with Matchers {
    "Assign" should "check whether a number is prime or not" in {
      obj.isprime(11) shouldBe true
    }

    it should "calculate gcd " in {
      obj.gcd(5,10) shouldBe "5"
    }
  }
