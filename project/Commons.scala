import play.sbt.routes.RoutesKeys._
import sbt.Keys._

object Commons {
  val settings = Seq(
    organization := "leak",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.11.7"
  )

  val webappSettings = Seq(
    routesGenerator := InjectedRoutesGenerator
  )
}
