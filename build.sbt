ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "gha-steward-test"
  )

val CatsEffectVersion = "2.5.1"
val WeaverTestVersion = "0.6.13"
val Http4sVersion = "0.21.33"
val Fs2Version = "2.5.9"

libraryDependencies += "org.typelevel" %% "cats-effect" % CatsEffectVersion
libraryDependencies += "co.fs2" %% "fs2-core" % CatsEffectVersion
libraryDependencies += "org.http4s" %% "http4s-dsl" % Http4sVersion
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % Http4sVersion
libraryDependencies += "com.disneystreaming" %% "weaver-cats" % WeaverTestVersion % Test
testFrameworks += new TestFramework("weaver.framework.CatsEffect")
