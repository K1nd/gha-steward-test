package ltd.k1nd.ghastewardtest

import cats.effect.Async
import cats.syntax.all._
import fs2.Stream
import org.http4s.blaze.server.BlazeServerBuilder
import org.http4s.implicits._

object TestServer {

  def stream[F[_]](implicit F: Async[F]): Stream[F, Nothing] = {
    for {
      _ <- Stream.eval(F.delay(println("Starting server...")))
      httpApp = (
        StatusRoutes[F]() <+>
          HelloWorldRoutes[F]()
      ).orNotFound

      exitCode <- Stream.resource(
        BlazeServerBuilder[F].withHttpApp(httpApp).resource
      )

      _ <- Stream.never[F]
    } yield exitCode
  }.drain
}
