import play.Project._

name := """scalatest-withplay"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.0", 
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.scalatest" %% "scalatest" % "2.1.0" % "test"
)

playScalaSettings
