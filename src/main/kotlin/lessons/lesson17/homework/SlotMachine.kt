package lessons.lesson17.homework

//Игровой автомат
//Опиши схематически класс игрового автомата, правильно расставив объявление полей (val или var) и методов (аргументы и возвращаемые значения), включая модификаторы доступа (private для приватных)
//
//Поля:
//
//цвет
//модель
//включен
//ОС загружена
//список установленных игр
//наличие джойстика
//баланс вырученных средств
//владелец
//телефон поддержки.
//игровой сеанс оплачен
//стоимость одного игрового сеанса
//пин-код автомата
//Методы:
//
//включить
//выключить
//загрузить ОС
//завершить работу ОС
//показать список игр
//включить игру
//оплатить игровой сеанс
//забрать наличные с помощью пин-кода
//открыть сейф и выдать наличные

class SlotMachine(
    val color: String,
    val model: String,
    val gamesInstalled: List<String>,
    val hasJoystick: Boolean,
    private var pinCode: String
) {
    var isOn = false
        private set

    var isOSLoaded = false
        private set

    private var fundsEarned = 0.0

    private var owner = "Buka"

    var supportNumber = "8 (800) 200-06-00"
        private set

    val costPerSession = 0.07

    var isSessionPaid = false
        private set

    fun turnOn() {
        isOn = true
        loadOS()
        println("The slot machine has been turned on.")
    }

    fun turnOff() {
        isOn = false
        stopOS()
        println("The slot machine has been turned off.")
    }

    private fun loadOS() {
        isOSLoaded = true
        println("The OS has been loaded.")
    }

    private fun stopOS() {
        isOSLoaded = false
        println("The OS has been stopped.")
    }

    fun showGameList() {
        println(gamesInstalled)
    }

    fun turnGameOn(name: String) {
        if (isSessionPaid && gamesInstalled.contains(name)) {
            println("$name is about to launch.")
            isSessionPaid = false
        } else {
            println("$name has not been found or the session has not been paid for.")
        }
    }

    fun payForSession() {
        isSessionPaid = true
        fundsEarned += costPerSession
        println("You can start playing now.")
    }

    fun takeOutCash(pinCode: String) {
        if (this.pinCode == pinCode) {
            giveOutCash()
        } else {
            println("The PIN code you entered is incorrect.")
        }
    }

    private fun giveOutCash() {
        println("You are about to take out $$fundsEarned.")
    }
}

fun main() {
    val slotMachine = SlotMachine(
        color = "white",
        model = "A371",
        gamesInstalled = listOf(
            "Heroes of Might and Magic III",
            "Age of Empires",
            "Need for Speed"
        ),
        true,
        "Buka"
    )
    slotMachine.turnOn()
    slotMachine.turnOff()
    slotMachine.showGameList()
    slotMachine.turnGameOn("Stalker")
    slotMachine.turnGameOn("Need for Speed")
    slotMachine.payForSession()
    slotMachine.takeOutCash("1234")
    slotMachine.takeOutCash("0841")
}