package DiplomaAccount

import zio.*
import zio.ZIOAppDefault
import zio.Console

import java.io.IOException

object BootApp extends ZIOAppDefault {
  def run =
    Console.printLine("Hello World")

}
