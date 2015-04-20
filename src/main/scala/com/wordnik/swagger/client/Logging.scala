package com.wordnik.swagger.client

import org.slf4j.LoggerFactory

trait Logging {
  @transient protected val logger = com.typesafe.scalalogging.Logger(LoggerFactory.getLogger(getClass))
}