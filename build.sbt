ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "gha-steward-test"
  )

val CatsEffectVersion = "2.5.5"
val WeaverTestVersion = "0.6.10"
val Http4sVersion = "0.21.33"
val Fs2Version = "2.5.9"
val Log4CatsVersion = "2.4.0"

libraryDependencies += "org.typelevel" %% "cats-effect" % CatsEffectVersion
libraryDependencies += "co.fs2" %% "fs2-core" % CatsEffectVersion
libraryDependencies += "org.http4s" %% "http4s-dsl" % Http4sVersion
libraryDependencies += "org.http4s" %% "http4s-blaze-server" % Http4sVersion
libraryDependencies += "org.typelevel" %% "log4cats-core" % Log4CatsVersion
libraryDependencies += "org.typelevel" %% "log4cats-slf4j" % Log4CatsVersion
libraryDependencies += "com.disneystreaming" %% "weaver-cats" % WeaverTestVersion % Test
testFrameworks += new TestFramework("weaver.framework.CatsEffect")
