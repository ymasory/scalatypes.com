import com.typesafe.startscript.StartScriptPlugin

organization := "com.scalatypes"

name := "scalatypes.com"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.2"

classpathTypes ~= (_ + "orbit")

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" % "scalatra" % "2.2.0-SNAPSHOT",
  "org.scalatra" % "scalatra-scalate" % "2.2.0-SNAPSHOT",
  "org.scalatra" % "scalatra-specs2" % "2.2.0-SNAPSHOT" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "8.1.7.v20120910" % "compile;container",
  "org.eclipse.jetty.orbit" % "javax.servlet" % "3.0.0.v201112011016" % "compile;provided;test;container" artifacts (Artifact("javax.servlet", "jar", "jar"))
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
//resolvers += Resolvers.sonatypeRepo("snapshots")

//seq(StartScriptPlugin.startScriptForWarSettings: _*)

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

