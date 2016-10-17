name := "rules-spi"

scalaVersion in ThisBuild := "2.11.8"

version in ThisBuild := "1.0-SNAPSHOT"

organization in ThisBuild := "com.foo"

scalacOptions in ThisBuild   := List(
  "-encoding",
  "UTF8",
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xlint",
  "-language:postfixOps",
  "-language:higherKinds")

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging"   %% "scala-logging"      % Versions.ScalaLogging,
  "ch.qos.logback"                % "logback-classic"    % Versions.Logback,
  "com.pathfinder"               %% "wire-read"          % Versions.Wire,
  "com.pathfinder"               %% "wire-common"        % Versions.Wire
)

fork in run := true