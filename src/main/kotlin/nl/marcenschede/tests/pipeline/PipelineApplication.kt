package nl.marcenschede.tests.pipeline

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@RestController
class PipelineApplication {

    @GetMapping("/hello")
    fun rootGet(): String {
        return "Hello hackers!"
    }
}

fun main(args: Array<String>) {
    runApplication<PipelineApplication>(*args)
}
