package lessons.lesson17.practice

class Lamp {
    var isOn = false
        private set//из-за этого геттер не нужен, тк переменная не private, но
    //задать из-за private set мы ничего не можем

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

//    fun getState() = isOn
}