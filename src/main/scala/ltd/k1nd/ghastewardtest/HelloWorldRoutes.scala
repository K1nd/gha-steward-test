package ltd.k1nd.ghastewardtest

import cats.effect.Sync
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

object HelloWorldRoutes {
  def apply[F[_]: Sync](): HttpRoutes[F] = {
    val dsl = new Http4sDsl[F] {}
    import dsl._
    HttpRoutes.of[F] { case GET -> Root / "hello" / name =>
      Ok(s"Hello $name!")
    }
  }
}
