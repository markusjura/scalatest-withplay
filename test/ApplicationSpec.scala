import org.scalatest._
import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class ApplicationSpec extends WordSpec with Matchers {

  "Application" should {

    "send 404 on a bad request" in new WithApplication{
      route(FakeRequest(GET, "/boum")) shouldBe ('defined)
    }

    "render the index page" in new WithApplication{
      val home = route(FakeRequest(GET, "/")).get

      status(home) shouldBe OK
      contentType(home) shouldBe Some("text/html")
      contentAsString(home) should include ("Hello Play Framework")
    }
  }
}
