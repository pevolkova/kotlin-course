package lessons.lesson16.homework

import lessons.lesson16.practice.Background
import lessons.lesson16.practice.Colors
import lessons.lesson16.practice.printColored

//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое
//слово отдельно чёрными буквами на белом фоне (хорошо работает на тёмной теме)

class LaserPrinter: Printer() {
    override fun print(text: String) {
        val splitText = text.split(" ")
        splitText.forEach { printColored(it, Colors.BLACK, Background.WHITE) }
    }
}