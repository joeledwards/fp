package com.buzuli.fp

import org.scalatest.{BeforeAndAfterAll, BeforeAndAfterEach, EitherValues}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.{AnyWordSpec, AsyncWordSpec}

import java.util.concurrent.TimeUnit
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

/**
 * Parent of all synchronous unit tests.
 */
abstract class UnitSpec
  extends AnyWordSpec
  with BeforeAndAfterEach
  with BeforeAndAfterAll
  with EitherValues
  with Matchers {
}

/**
 * Parent of asynchronous unit tests.
 */
abstract class AsyncUnitSpec
  extends AsyncWordSpec
  with BeforeAndAfterEach
  with BeforeAndAfterAll
  with EitherValues
  with Matchers {
}
