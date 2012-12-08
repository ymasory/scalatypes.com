import com.typesafe.startscript.StartScriptPlugin

/* basic */
organization := "com.scalatypes"

name := "scalatypes.com"

version := "1.0.0-SNAPSHOT"

description := "Scala Types podcast website"

/* compilation */
scalaVersion := "2.9.1"

scalacOptions ++= Seq(
  // "-feature",
  // "-language:higherKinds",
  // "-language:implicitConversions",
  // "-language:experimental.macros",
  "-deprecation",
  "-unchecked"
)

/* dependencies */
libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.2.0-SNAPSHOT",
  "org.scalatra" % "scalatra-scalate" % "2.2.0-SNAPSHOT",
  "org.scalatra" % "scalatra-specs2" % "2.2.0-SNAPSHOT" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "compile;container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;provided;test;container" artifacts (Artifact("javax.servlet", "jar", "jar")),
  "joda-time" % "joda-time" % "2.1",
  "org.clapper" %% "grizzled-slf4j" % "0.6.10",
  "ch.qos.logback" % "logback-classic" % "1.0.7" % "provided",
  "com.typesafe" % "config" % "1.0.0",
  "org.json4s" %% "json4s-native" % "3.0.0",
  // "org.apache.commons" % "commons-lang3" % "3.1",
  // "org.scalaz" %% "scalaz-core" % "7.0.0-M4",
  // "org.scalaz" %% "scalaz-effect" % "7.0.0-M4",
  // "commons-io" % "commons-io" % "2.4",
  // "com.github.scala-incubator.io" %% "scala-io-core" % "0.4.1-seq",
  // "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.1-seq",
  // "com.typesafe.akka" % "akka-actor" % "2.0.3",
  // "org.scala-stm" %% "scala-stm" % "0.6",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "org.specs2" %% "specs2" % "1.12.2" % "test"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots")
  // Resolver.typesafeIvyRepo("snapshots")
  // Resolver.typesafeIvyRepo("releases")
  // Resolver.typesafeRepo("releases")
  // Resolver.typesafeRepo("snapshots")
  // JavaNet2Repository,
  // JavaNet1Repository
)

/* web stuff */
seq(StartScriptPlugin.startScriptForClassesSettings: _*)

classpathTypes ~= (_ + "orbit")

seq(webSettings :_*)

/* bureaucracy */
homepage := Some(url("https://github.com/ymasory/scalatypes.com"))

startYear := Some(2012)

licenses := Seq(
  ("AGPLv3", url("http://www.gnu.org/licenses/agpl-3.0.txt"))
)

