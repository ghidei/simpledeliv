name := "simpledeliv"

version := "1.1.1"

scalaVersion := "2.12.4"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.20"

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.5.10")



lazy val ldfiakka = (project in file ("ldfi-akka"))
  //.dependsOn(lalibs)
  .settings(
    name := "ldfi-akka",
    mainClass in Compile := Some("ldfi.akka.Main")
  )






lazy val lalibs = RootProject(file("ldfi-akka"))