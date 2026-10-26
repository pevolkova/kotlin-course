package lessons.lesson14.homework.task6

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
}