package lessons.lesson16.homework

import lessons.lesson16.practice.Background
import lessons.lesson16.practice.Colors
import lessons.lesson16.practice.printColored
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds

class InkjetPrinter : Printer() {
    override fun print(text: String) {
        val splitText = text.split(" ")
        val colored = listOf(
            Colors.BLUE to Background.YELLOW,
            Colors.RED to Background.GREEN,
            Colors.PURPLE to Background.WHITE
        )
        splitText.forEachIndexed { index, string ->
            val colorIndex = index % colored.size
            printColored(
                string,
                colored[colorIndex].first,
                colored[colorIndex].second
            )
        }
    }
}