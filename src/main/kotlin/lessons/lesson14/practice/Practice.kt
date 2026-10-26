package lessons.lesson14.practice

import lessons.lesson14.homework.Moon.showPhase
import lessons.lesson14.practice.Sun.shine

fun main() {

    val lamp = Lamp(true)
    lamp.toggle()

    val wind = Wind(40)
    println("Скорость ветра: ${wind.convertToMetersPerSecond()} м/с")

    shine()
//    showPhase(false, "Full Moon")

}
//    Практические задания
//1. Физический предмет: Лампа Создайте класс Lamp, который
//будет представлять лампу. У лампы должно быть свойство
//isOn (Boolean), которое показывает, включена ли лампа.
//Добавьте метод toggle(), который меняет состояние лампы
//(включает или выключает её).

class Lamp(var isOn: Boolean) {
    fun toggle() {
        isOn = !isOn
        val state = if (isOn) "on" else "off"
        println("The lamp is $state")
    }
}
//конструктор и поля могут совпадать
//внутри класса методы и поля и иногда другие классы или compamion object
//внутри функции класса при этом не будут они доступны

//2. Явление: Ветер Создайте класс Wind, который будет представлять
//ветер. В классе должно быть свойство speed (Int), которое
//описывает скорость ветра (в км/ч). Добавьте метод
//convertToMetersPerSecond(), который пересчитывает скорость
//ветра в метры в секунду и возвращает это значение.
//
class Wind(var speed: Int) {
    fun convertToMetersPerSecond(): Double {
        return speed / 3.6
    }
}

//
//3. Природное явление: Солнце Создайте объект Sun, который будет
//представлять солнце. Добавьте свойства isShining (Boolean),
//чтобы отображать, светит ли солнце в данный момент, и
//temperature (Int), чтобы отображать текущую температуру на
//поверхности солнца в градусах Цельсия. Добавьте метод shine(),
//который выводит сообщение, если солнце светит.
//
//
object Sun { //тут вообще нельзя написать конструктор, тк это уже объект
    var isShining: Boolean = true
    var temperature: Int = 5647
    fun shine() {
        if (isShining){
            println("The Sun is shining with a temperature of $temperature°C")
        } else{
            println("The Sun is not shining, but its temperature is $temperature")
        }
        return
    }

}

//4. Транспортное средство: Автомобиль Создайте класс Car,
//который будет представлять автомобиль. В классе должны быть
//свойства brand (String) и model (String). Добавьте companion
//object, который будет содержать список популярных брендов
//автомобилей. Добавьте метод showInfo(), который выводит
//информацию об автомобиле.
//
//
//5. Заказ в ресторане: Блюдо Создайте data class Dish, который
//будет представлять блюдо в ресторане. У него должны быть свойства
//name (String), ingredients (List), и price (Double). Добавьте
//метод describeDish(), который выводит описание блюда и его
//ингредиенты.
//