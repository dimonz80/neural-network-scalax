// scalacOptions := Seq("-Ypartial-unification")

lazy val root = project
  .in(file("."))
  .settings(
    name := "Neural network scalax",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.10",
    libraryDependencies += "co.fs2" %% "fs2-core" % "3.8.0",
    libraryDependencies += "co.fs2" %% "fs2-io" % "3.8.0",
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0",
    libraryDependencies += "org.typelevel" %% "cats-kernel" % "2.10.0",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test
  )
