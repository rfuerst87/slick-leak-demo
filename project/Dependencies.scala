import sbt._

object Dependencies {
  val slick = "com.typesafe.slick" %% "slick" % Version.slick
  val playSlick = "com.typesafe.play" %% "play-slick" % Version.playSlick
  val h2Database = "com.h2database" % "h2" % Version.h2Database
  val scalaTestPlusPlay =  "org.scalatestplus" %% "play" % Version.scalaTestPlusPlay % "test"

  val webappDependencies: Seq[ModuleID] = Seq(
    slick,
    playSlick,
    h2Database,
    scalaTestPlusPlay
  )
}

object Version {
  val slick = "3.1.1"
  val playSlick = "1.1.1"
  val h2Database = "1.3.176"
  val scalaTestPlusPlay = "1.4.0"
}
