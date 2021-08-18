package com.buzuli.fp

class UtilSpec extends UnitSpec {
  "Util.time" when {
    "now is called" should {
      "return the current time" in {
        val sysNow = System.currentTimeMillis
        val now = Util.time.now
        assert(now.toEpochMilli >= sysNow)
      }
    }
  }
}
