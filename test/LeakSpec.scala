import db.FooDb
import org.scalatest.concurrent.{IntegrationPatience, ScalaFutures}
import org.scalatestplus.play._
import play.api.Mode
import play.api.inject.guice.GuiceApplicationBuilder

class LeakSpec
  extends PlaySpec
    with OneAppPerSuite
    with ScalaFutures
    with IntegrationPatience {

  override lazy val app = new GuiceApplicationBuilder()
    .in(Mode.Test)
    .build

  "run test" in {
    val fooDb = app.injector.instanceOf[FooDb]
    whenReady(fooDb.findAll()) { result =>
      result mustBe a[Seq[_]]
    }
  }
}
