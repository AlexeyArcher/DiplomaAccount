ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.2-RC1"

lazy val root = (project in file("."))
  .settings(
    name := "DiplomaAccount",
    scalacOptions ++= Seq("-Ytasty-reader", "-Ykind-projector:underscores"),
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "2.0.0-RC2",
      "dev.zio" %% "zio-logging-slf4j" % "2.0.0-RC5",
      "ch.qos.logback" % "logback-classic" % "1.4.6",
      "dev.zio" %% "zio-interop-cats" % "23.0.0.0",
      "org.tpolecat" %% "doobie-core" % "1.0.0-RC2",
      "org.tpolecat" %% "doobie-refined" % "1.0.0-RC2",
      "org.tpolecat" %% "doobie-hikari" % "1.0.0-RC2",
      "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC2",
      "org.flywaydb" % "flyway-core" % "9.16.0",
      "org.http4s" %% "http4s-blaze-server" % "0.23.14",
      "org.http4s" %% "http4s-dsl" % "0.23.14",
      "eu.timepit" %% "refined" % "0.10.2",
      "io.circe" %% "circe-refined" % "0.15.0-M1",
      "com.softwaremill.sttp.tapir" %% "tapir-zio-http4s-server" % "1.0.0-M1",
      "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % "1.2.10",
      "com.softwaremill.sttp.tapir" %% "tapir-swagger-ui-bundle" % "1.2.10",
      "com.github.pureconfig" %% "pureconfig-core" % "0.17.2",
      "dev.zio" %% "zio-test" % "2.0.10" % "test",
      "dev.zio" %% "zio-mock" % "1.0.0-RC2-2" % "test",
      "dev.zio" %% "zio-test-sbt" % "2.0.10" % "test",
      "com.github.sbt" % "junit-interface" % "0.13.3" % "test"
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
