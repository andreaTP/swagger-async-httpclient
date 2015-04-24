package com.wordnik.swagger.client

import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success, Try}

abstract class ApiClient(client: TransportClient, config: SwaggerConfig){
  protected implicit val execContext = client.execContext

  protected def format(pth: String) = pth.replace("{format}", config.contentType.name)

}
