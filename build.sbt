name := "swagger-async-httpclient"

organization := "com.wordnik.swagger"

scalaVersion := "2.11.6"

version := "0.4.0-SNAPSHOT"

scalacOptions ++= Seq(
    	"-unchecked", 
    	"-deprecation", 
    	"-Xcheckinit",
    	"-encoding","utf8",
    	"-language:implicitConversions", 
    	"-language:reflectiveCalls")
    	
javacOptions in compile ++= Seq(
		"-target","1.7", 
		"-source", "1.7", 
		"-Xlint:deprecation")
		
libraryDependencies ++= Seq(
        "com.ning" % "async-http-client" % "1.9.9",
        "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
)   