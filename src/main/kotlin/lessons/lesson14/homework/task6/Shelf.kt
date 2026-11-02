package lessons.lesson14.homework.task6

fun main() {
    val shelf = Shelf(15)
    shelf.addItem("Apple")
    shelf.addItem("Pear")
    shelf.addItem("Cake")
    shelf.removeItem("Pear")
    println(shelf.containsItem("Pie"))
    println(shelf.getItems())

    val shelf1 = Shelf (17)
    shelf1.addItem("Can")
    shelf1.addItem("Bottle")
    shelf1.addItem("Carrot")
    println(shelf1.getItems())

    val shelf2 = Shelf (25)
    shelf2.addItem("Milk")
    shelf2.addItem("Banana")
    shelf2.addItem("Cheese")
    println(shelf2.getItems())

    val shelf3 = Shelf (41)
    shelf3.addItem("Cucumber")
    shelf3.addItem("Beetroot")
    shelf3.addItem("Turkey")
    println(shelf3.getItems())

    val rack = Rack (mutableListOf(shelf, shelf1, shelf2),
        4)
    println(rack.addShelf(shelf2))
    println(rack.shelves.toString())
    rack.removeShelf(0)
    println(rack.shelves.toString())
    rack.addItem("Raisin")
    println(rack.shelves.toString())
}

//Задание 6. Стеллаж и полки.
//
//Цель задания: Создать систему управления складским пространством
//с использованием классов "Стеллаж" и "Полка стеллажа".
//
//Класс Shelf (Полка Стеллажа)
//
//Характеристики:
//
//Вместимость полки (capacity): максимальная сумма букв всех
//названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.
//Методы:
//
//Добавление Предмета (addItem):
//Принимает название предмета.
//Проверяет, поместится ли предмет на полку, учитывая длину его
//названия и текущее заполнение полки.
//Возвращает true и добавляет предмет, если есть место. В противном
//случае возвращает false.
//Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой
//предмет не найден.
//Проверка Вместимости (canAccommodate):
//Принимает название предмета.
//Определяет, вместится ли предмет на полку.
//Возвращает true, если предмет вместится, и false, если места
//недостаточно.
//Проверка наличия предмета (containsItem):
//Принимает название предмета
//Возвращает true если такой предмет есть
//Получение списка предметов (getItems):
//Возвращает неизменяемый список предметов

class Shelf(val capacity: Int) {
    private val items: MutableList<String> = mutableListOf()
    fun addItem(itemName: String): Boolean {
        if (canAccomodate(itemName)) {
            items.add(itemName)
            return true
        }
        return false
    }

    fun canAccomodate(itemName: String): Boolean {
        val shelfQuantity = items.joinToString().length
        return capacity >= itemName.length + shelfQuantity
    }

    fun removeItem(itemName: String) = items.remove(itemName)


    fun containsItem(itemName: String) = items.contains(itemName)

    fun getItems() = items.toList()

    override fun toString(): String {
        return "Shelf with $capacity symbols contains $items"
    }
}