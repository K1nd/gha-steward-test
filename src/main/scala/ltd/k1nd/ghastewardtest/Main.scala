package ltd.k1nd.ghastewardtest

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple {
  override def run: IO[Unit] = TestServer.stream.compile.drain
}
