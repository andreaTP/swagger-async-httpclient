name := "swagger-async-httpclient"

organization := "com.wordnik.swagger"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.9.3", "2.10.5")

scalacOptions ++= Seq(
    	"-unchecked", 
    	"-deprecation", 
    	"-optimize", 
    	"-Xcheckinit",
    	"-Yinline-warnings",
    	"-encoding","utf8",
    	"-language:implicitConversions", 
    	"-language:reflectiveCalls")
    	
javacOptions in compile ++= Seq(
		"-target","1.6", 
		"-source", "1.6", 
		"-Xlint:deprecation")
		
		
//"ch.qos.logback" % "logback-classic" % "1.0.13" % "provided",		
libraryDependencies ++= Seq(
        "org.scalatra.rl" %% "rl" % "0.4.10",
        "org.slf4j" % "slf4j-api" % "1.7.12",       
        "org.json4s" %% "json4s-jackson" % "3.2.11",
        "com.googlecode.juniversalchardet" % "juniversalchardet" % "1.0.3",
        "eu.medsea.mimeutil" % "mime-util" % "2.1.3" exclude("org.slf4j", "slf4j-log4j12") exclude("log4j", "log4j"),
        "com.ning" % "async-http-client" % "1.9.20",
        "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"
      )