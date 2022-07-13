package ltd.k1nd.ghastewardtest

import cats.effect._
import org.http4s.{Method, Request, Status}
import weaver.SimpleIOSuite
import org.http4s.dsl.io._
import org.http4s.implicits.http4sLiteralsSyntax

object StatusRoutesTest extends SimpleIOSuite {

  val randomUUID = IO(java.util.UUID.randomUUID())

  test("test status endpoint") {
    for {
      response <- StatusRoutes[IO]()
        .run(Request[IO](Method.GET, uri"/status"))
        .value
    } yield exists(response)(res => expect(res.status == Status.NoContent))
  }

}
