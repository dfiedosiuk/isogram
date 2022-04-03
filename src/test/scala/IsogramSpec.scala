import org.scalatest._
import flatspec._
import matchers._
import Isogram._


class IsogramSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An Isogram.check() "

  it should "return true for examples that are isograms " in {
    check("lumberjacks") shouldBe true
    check("background") shouldBe true
    check("downstream") shouldBe true
    check("six-year-old") shouldBe true
    check("six year old") shouldBe true
    check("six  year  OLD") shouldBe true
  }

  it should "return false for words with repeating letters " in {
    check("isograms") shouldBe false
    check("example") shouldBe false
    check("RepEating") shouldBe false
    check("eleven") shouldBe false
  }

}
