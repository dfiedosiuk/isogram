import org.scalatest._
import flatspec._
import matchers._
import Isogram._


class IsogramSpec extends AnyFlatSpec with should.Matchers {

  behavior of "An Isogram.check() "

  it should "return true or false if word/phrase is isogram  " in {
    check("example") shouldBe true
  }

}
