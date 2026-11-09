package lessons.lesson17.practice

class GameConsole() {
    fun startGame(name: String) {
        loadGame(name)
    }

    private fun initializeHardware() {
        println("I'm ready")
    }

    private fun loadGame(name: String) {
        initializeHardware()
        println("The game has started.")
    }
}

fun main() {
    val gameConsole = GameConsole()
    gameConsole.startGame(name = "MyGame")
}