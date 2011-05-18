organization := "org.netbeans"

name := "sbt-netbeans-plugin"

version := "0.9.7"

sbtPlugin := true

resolvers += ScalaToolsSnapshots

libraryDependencies += "org.scalaz" %% "scalaz-core" % "6.0-SNAPSHOT"

publishArtifact in (Compile, packageDoc) := false

publishMavenStyle := true

publishTo := Some(Resolver.file("Local", new File("/home/remeniuv/Dropbox/remeniuk.github.com/maven"))(Patterns(true, Resolver.mavenStyleBasePattern)))