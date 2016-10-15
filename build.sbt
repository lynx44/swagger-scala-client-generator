import _root_.sbt.Keys._

name := "swagger-scala-client-generator"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-parser" % "1.0.22",
  "org.specs2" %% "specs2-core" % "3.8.5" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")