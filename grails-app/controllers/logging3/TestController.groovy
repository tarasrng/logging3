package logging3

import org.apache.logging.slf4j.Log4jLogger


class TestController {

    def index() {
        log.debug("DEBUG")
        log.error("Err")
        log.info("inf")
        log.warn("warn")
        render "Yes!"
        Log4jLogger
    }
}
