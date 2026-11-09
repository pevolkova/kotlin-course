package lessons.lesson18.homework

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}