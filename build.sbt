import Dependencies._

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(Commons.settings: _*)
  .settings(Commons.webappSettings: _*)
  .settings(
    fork in Test := false,
    parallelExecution  in Test := true,
    name := "webapp",
    libraryDependencies ++= webappDependencies
  )
