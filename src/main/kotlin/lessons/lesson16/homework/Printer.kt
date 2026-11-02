package lessons.lesson16.homework

//Создай абстрактный принтер, который имеет абстрактный метод печати,
//принимающий в качестве аргумента строку.

abstract class Printer {
    abstract fun print(text: String)
}

fun main() {
    val laserPrinter = LaserPrinter()
    laserPrinter.print("Шарик в гостях у Барбоса")

    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.print("Many, many years ago English pilgrims came to America." +
            " The winter was very cold, but the Indians helped them.")
}