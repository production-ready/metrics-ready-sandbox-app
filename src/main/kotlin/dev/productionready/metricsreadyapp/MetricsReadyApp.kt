package dev.productionready.metricsreadyapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MetricsReadyApp

fun main(args: Array<String>) {
	runApplication<MetricsReadyApp>(*args)
}
