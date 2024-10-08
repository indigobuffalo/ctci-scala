package chapters.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloSpec extends AnyFlatSpec with Matchers {
  "Hello" should "Say hello" in {
    Hello.greeting should be ("hello")
  }
}
