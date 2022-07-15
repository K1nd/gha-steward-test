ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "gha-steward-test"
  )

libraryDependencies += "org.typelevel" %% "cats-effect" % "2.5.5"
libraryDependencies += "co.fs2" %% "fs2-core" % "2.5.9"
libraryDependencies += "org.http4s" %% "http4s-dsl" % "0.23.13"
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % "0.23.13"
libraryDependencies += "org.typelevel" %% "log4cats-core" % "2.4.0"
libraryDependencies += "org.typelevel" %% "log4cats-slf4j" % "2.4.0"
libraryDependencies += "com.disneystreaming" %% "weaver-cats" % "0.6.10" % Test
testFrameworks += new TestFramework("weaver.framework.CatsEffect")
