package DiplomaAccount

import zio._
import zio.ZIOApp

object BootApp extends ZIOApp:
  override type Environment = ZEnv

  override val tag: EnvironmentTag[Environment] = EnvironmentTag[Environment]

  override def layer: ZLayer[ZIOAppArgs, Throwable, Environment] =
    ZLayer.make[ZEnv](
      ZEnv.live
    )
  override def run: ZIO[Console, java.io.IOException, Unit] = {
    Console.printLine("Hello World")
  }


