package lessons.lesson14.practice

import lessons.lesson03.homework.location
import lessons.lesson14.homework.Party

//Объектно-ориентированное программирование
//Объекты, классы
//Принципы ООП: полиморфизм, абстракция, инкапсуляция,
//наследование
//
//объект получается через инициализацию класса (вентиляторы + их
//характеристики
//
//Класс и объект - разные вещи
//Класс - шаблон/чертеж, описывающий состояние/поведение объектов
//класса. Поля = атрибуты класса + методы/функции (процедуры)
//
//Методы - действия, способы обработки данных
//
//Поля - статические переменные с данными, состояние
//
//Объект - экземпляр класса, созданный из чертежа
//
//Иногда объект и класс пересекаются по значению

fun main() {
    val seatCarriage = Carriage(40)
    val compartmentCarriage = Carriage(16, "Купе")
    val person = Person("John", 30)
    person.sayHello()
Extra.size++
    //перемен хранит экземпляр, а там состояние, класс и переменная
    //называются одинаково
    val calc1 = Calculator()
        val result = calc1.sum(1,2)
    println(result)
    val result1 = calc1.sum(4,5)
    println(result1)
    println("Local sum ${calc1.localSum} companion sum ${Calculator.companionSum}")
    val calc2 = Calculator()
    calc2.sum(2,3)
    println(Calculator.companionSum)
    println(Extra.size)
    println(calc2.localSum)
    Party("garden", 35).details()
//    println(calc1.localSum)
}

class Person(val name: String, var age: Int) {
    //Данные + конструктор класса
    //Метод класса доступен через точку
    fun sayHello() {
        println("Hello, my name is $name and I am $age years old.")
    }
}
    //можно создавать все в одном файле, но это плохая практика.
    //В Java файлы и есть классы, нельзя много классов вместе.

    object Logger {
        val p1 = ""//этот будет доступен где угодно, в отличие от класса
        //а классы сборщик мусора вне функции чистит
    }//одновременно и класс с полями и данными, но не
    //может быть конструктором (это и класс, и экземпляр класса, единственный)

object Extra {
    var size = 0
}

    class Calculator {
        companion object {
            var companionSum = 0
//            fun add(a: Int, b: Int): Int {
//                t = t + a + b
//                return a + b
//                //объект отовсюду, поля только в рамках класса
//            }
        }
        var localSum = 0

        fun sum(a: Int, b: Int): Int {
            companionSum = companionSum + a + b
            localSum = localSum + a + b
            Extra.size = Extra.size + a + b
                return a + b
        }
    }//в единственном экземпляре (доступ без создания
    //экземпляра класса
//    Calculator.add (1, 2)

    data class User(val id: Int, val name: String) //функции для работы с данными более простой
//user1.copy //скопирует значение, а поле сохранит из переданного

    //Конструктор класса объявляет необходимые для инициализации поля
    class Passenger(
        val name: String,
        private val dateOfBirth: String,
        private var phone: String
    ) {
//        private fun
//                public fun
    }

    //это первичный конструктор, в него входят только те данные,
    //которые нужно инициализировать
    class Carriage(
        val capacity: Int,
        val type: String = "Плацкарт" //значение по умолчанию
    )

    //приватные данные внутри класса недоступны, при этом функции выполняются
    class Train(val engineType: String) {
        val carriages = mutableListOf<Carriage>()
        fun boardPassengers(
            passenger: Passenger,
            seat: Int,
            carriageType: String
        ) {
        } //вагоны спрятаны в поезде с помощью инкапсуляции
    }