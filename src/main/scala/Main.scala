
/**
  *
  * User: lembrd
  * Date: 21/03/2018
  * Time: 17:20
  */

object Main extends App {

  import scala.util.Try
  import cats.implicits._

  def either1() : Either[String, Int] = Right(1)

  Try(either1()).toEither.flatten

}
