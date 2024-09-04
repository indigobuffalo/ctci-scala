name := "ctci-scala"

version := "0.1"

scalaVersion := "2.12.19"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test

scalacOptions ++= Seq(
  "-deprecation",        // Emit warning and location for usages of deprecated APIs.
  "-feature",            // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked",          // Enable additional warnings where generated code depends on assumptions.
  "-encoding", "UTF-8",  // Specify character encoding used by source files.
  "-Xlint",              // Enable recommended additional warnings.
  "-Ywarn-dead-code",    // Warn when dead code is identified.
  "-Ywarn-unused",       // Warn when local and private vals, vars, defs, and types are unused.
  "-Ywarn-unused-import" // Warn when imports are unused.
)

Test / parallelExecution := true

Test / testOptions += Tests.Argument("-oF")
