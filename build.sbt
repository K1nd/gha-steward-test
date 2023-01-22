ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "gha-steward-test"
  )

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.4-389-3862cf0"
libraryDependencies += "co.fs2" %% "fs2-core" % "3.2.10"
libraryDependencies += "org.http4s" %% "http4s-dsl" % "0.23.18"
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % "0.23.12"
libraryDependencies += "org.typelevel" %% "log4cats-core" % "2.4.0"
libraryDependencies += "org.typelevel" %% "log4cats-slf4j" % "2.4.0"
libraryDependencies += "com.disneystreaming" %% "weaver-cats" % "0.7.13" % Test
testFrameworks += new TestFramework("weaver.framework.CatsEffect")
