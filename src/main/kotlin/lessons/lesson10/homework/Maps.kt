package lessons.lesson10.homework

import kotlin.collections.iterator
import kotlin.to

fun main() {
    addition()
    getter()
    removal()
    eternity()
    change()
    join()
    addElements()
    dataAddition()
    find()
}

//Задачи на работу со словарём
//1. Создайте пустой неизменяемый словарь, где ключи и значения -
//целые числа.

val ex1 = mapOf<Int, Int>()

//2. Создайте словарь, инициализированный несколькими парами
//"ключ-значение", где ключи - float, а значения - double

val ex2 = mapOf(10.0f to 9.0, 519.7f to 81.0, 48.5f to 7.8)

//3. Создайте изменяемый словарь, где ключи - целые числа, а
//значения - строки.

val ex3 = mutableMapOf<Int, String>(7 to "Пес и кот")

//4. Имея изменяемый словарь, добавьте в него новые пары
//"ключ-значение".

fun addition() {
    ex3.put(4, "Hi everyone")
    ex3.put(8, "Any string")
    println(ex3)
}

//5. Используя словарь из предыдущего задания, извлеките значение,
//используя ключ. Попробуй получить значение с ключом, которого
//в словаре нет.

fun getter() {
    println(ex3[5])
}

//6. Удалите определенный элемент из изменяемого словаря по его
//ключу.

fun removal() {
    ex3.remove(7)
    println(ex3)
}

//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле
//результат деления ключа на значение. Не забудь обработать деление
//на 0 (в этом случае выведи слово “бесконечность”)

fun eternity() {
    val ex4 = mutableMapOf<Double, Int>(
        4.0 to 7, 9.8 to 15,
        6.3 to 121, 7.21 to 0, 10.123 to 785
    )
    for ((double, int) in ex4) {
        if (int == 0) {
            println("бесконечность")
        } else println(double / int)
    }
}

//8. Измените значение для существующего ключа в изменяемом словаре.

fun change() {
    ex3[8] = "Кот и пес"
    println(ex3)
}

//9. Создайте два словаря и объедините их в третьем изменяемом
//словаре через циклы.

fun join() {
    val ex5 = mapOf<Int, String>(
        1 to "Monday", 2 to "Tuesday",
        3 to "Wednesday", 4 to "Thursday", 5 to "Friday", 6 to "Saturday"
    )
    val ex6 = mapOf<Int, String>(6 to "Super Bowl", 7 to "Sunday", 8 to "null")
    val ex7 = mutableMapOf<Int, String>()
    for ((int, str) in ex5) {
        ex7[int] = str
    }
    for ((int, str) in ex6) {
        if (int in ex7) continue
        ex7.put(int, str)
    }
    println(ex7)
}


//10. Создайте словарь, где ключами являются строки, а значениями -
//списки целых чисел. Добавьте несколько элементов в этот словарь.

fun addElements() {
    val map1 = mutableMapOf<String, List<Int>>()
    map1.put("Kotlin is fun", listOf(5, 7, 11))
    map1["Hello world"] = listOf(3, 4)
    map1.put("Headphones", listOf(37, 81))
    println(map1)

}

//11. Создай словарь, в котором ключи - это целые числа, а значения -
//изменяемые множества строк. Добавь данные в словарь. Получи
//значение по ключу (это должно быть множество строк) и добавь в это
//множество ещё строку. Распечатай полученное множество.

fun dataAddition() {
    val intStrings =
        mutableMapOf<Int, MutableSet<String>>(
            1 to mutableSetOf(
                "123",
                "345", "678"
            ), 2 to mutableSetOf("abc", "def")
        )
    intStrings[3] = mutableSetOf("xyz", "hi")
    intStrings[3]?.add("success")
    println(intStrings[3])
}


//12. Создай словарь, где ключами будут пары чисел. Через перебор
//найди значение у которого пара будет содержать цифру 5 в качестве
//первого или второго значения.

fun find() {
    val pairs = mapOf<Pair<Int, Int>, String>((1 to 2) to "One", (4 to 5) to "Two")
    for ((key, value) in pairs)
        if (key.first == 5 || key.second.equals(5)) {
            println(value)
        }
}

//Задачи на подбор оптимального типа для словаря
//1. Словарь библиотека: Ключи - автор книги, значения - список книг

val library = mutableMapOf<String, MutableList<String>>()

//2. Справочник растений: Ключи - типы растений (например, "Цветы",
//"Деревья"), значения - списки названий растений

val plants = mapOf<String, MutableList<String>>()

//3. Четвертьфинала: Ключи - названия спортивных команд, значения -
//списки игроков каждой команды

val teams = mapOf<String, MutableList<String>>()

//4. Курс лечения: Ключи - даты, значения - список препаратов
//принимаемых в дату

val treatment = mutableMapOf<String, MutableList<String>>()

//5. Словарь путешественника: Ключи - страны, значения - словари из
//городов со списком интересных мест.

val places = mapOf<String, MutableMap<String, MutableList<String>>>()

