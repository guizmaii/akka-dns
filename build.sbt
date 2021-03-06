organization := "ru.smslv.akka"

name := "akka-dns"

version := "2.4.2"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.12", "2.12.4")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test,
  "org.scalatest" %% "scalatest" % "3.0.5" % Test
)
