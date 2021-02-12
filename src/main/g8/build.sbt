enablePlugins(JavaAppPackaging)

name := $name$
version := "0.1"
scalaVersion := $scala_version$
organization := $organization$

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaVersion = $akka_version$
  val akkaHttpVersion = $akka_http_version$
  val circeVersion = "0.13.0"
  val akkaHttpCirceVersion = "1.35.3"
  val logbackVersion = "1.2.3"

  Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "io.circe"          %% "circe-core" % circeVersion,
    "io.circe"          %% "circe-generic" % circeVersion,
    "de.heikoseeberger" %% "akka-http-circe" % akkaHttpCirceVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "ch.qos.logback"    % "logback-classic" % logbackVersion
  )
}

Revolver.settings