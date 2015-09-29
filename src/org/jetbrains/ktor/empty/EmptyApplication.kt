package org.jetbrains.ktor.empty

import org.jetbrains.ktor.application.*
import org.jetbrains.ktor.routing.*

class EmptyApplication(config: ApplicationConfig) : Application(config) {
    init {
        routing {
            get("/") {
                response.sendText("Welcome to Ktor!")
            }
        }
    }
}