package ltd.k1nd.ghastewardtest

import cats.effect.{IO, IOApp}
import cats.implicits.catsSyntaxFlatMapOps
import org.typelevel.log4cats.SelfAwareStructuredLogger
import org.typelevel.log4cats.slf4j.Slf4jLogger

object Main extends IOApp.Simple {
  val logger: SelfAwareStructuredLogger[IO] = Slf4jLogger.getLogger[IO]

  override def run: IO[Unit] =
    logger.info("Starting server") >> TestServer.stream.compile.drain
}
