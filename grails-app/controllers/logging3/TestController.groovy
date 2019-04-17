package logging3


class TestController {

    def index() {
        log.debug("Debug")
        log.error("Error")
        log.info("Info")
        log.warn("Warning")
        render "Yes!"
    }
}
