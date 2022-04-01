import org.scalatest._
import flatspec._
import matchers._
import Isogram._


class IsogramSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An Isogram.check() "

  it should "return true or false if word/phrase is isogram  " in {
    check("example") shouldBe false
    check("lumberjacks") shouldBe true
    check("background") shouldBe true
    check("downstream") shouldBe true
    check("six-year-old") shouldBe true
  }

}
