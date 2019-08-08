package calculator

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class CalculatorSimulation extends Simulation {

  val httpConf = http
    .baseURL("http://localhost:8085/calc")
    .acceptHeader("application/json")
    .doNotTrackHeader("1")
    .disableFollowRedirect
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn = scenario("Simple Stress Test")
    .exec(http("request_1")
      .get("/history"))
    .pause(7)
    .exec(http("request_2")
      .get("/sum/5/2"))
    .pause(2)
    .exec(http("request_3")
      .get("/sum/5/5"))
    .pause(3)
    .exec(http("request_4")
      .get("/sub/5/2"))
    .pause(2)
    .exec(http("request_5")
      .get("/div/10/2"))
    .pause(670 milliseconds)
    .exec(http("request_6")
      .get("/mul/5/2"))
    .pause(629 milliseconds)
    .exec(http("request_7")
      .get("/sum/5/2"))
    .pause(734 milliseconds)
    .exec(http("request_8")
      .get("/sub/25/2"))
    .pause(5)
    .exec(http("request_9")
      .get("/mul/55/2"))
    .pause(1)
    .exec(http("request_10")
      .get("/history"))

  setUp(scn.inject(constantUsersPerSec(20).during(60 seconds)).protocols(httpConf))
}
