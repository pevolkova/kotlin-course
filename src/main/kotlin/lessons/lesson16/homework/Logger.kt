package lessons.lesson16.homework

import lessons.lesson16.practice.Background
import lessons.lesson16.practice.Colors
import lessons.lesson16.practice.printColored
import java.util.Objects

class Logger {
    fun log(message: String) {
        println("INFO: $message")
    }

    fun log(message: String, logLevel: String) {
        when (logLevel) {
            "WARNING" -> printColored("WARNING: $message", Colors.YELLOW)
            "ERROR" -> printColored("ERROR: $message", Colors.WHITE, Background.RED)
            else -> println("$logLevel: $message")
        }
    }

    fun log(messageList: List<String>) {
        messageList.forEach { log(it) }
    }

    fun log(objectLogged: Exception) {
        println("ERROR: ${objectLogged.message ?: "Неизвестная ошибка"}")
    }
}

fun main() {
    val logger = Logger()
    logger.log(message = "Что-то не работает.")

    logger.log("Что-то не работает.", "INFO")
    logger.log("Что-то не работает.", "ERROR")
    logger.log("Что-то не работает.", "DEBUG")
    logger.log("Что-то не работает.", "WARNING")
    logger.log(
        listOf(
            "Что-то не работает.",
            "Что-то пошло не так.",
            "Выйдите из системы.",
            "Попробуйте позже."
        )
    )
    logger.log(Exception())
}