package lessons.lesson10.practice

fun main() {
    val mutableMap1 = mutableMapOf("String1" to "Value1" )
    val mutableMap2 = mutableMapOf("String2" to "Value2")
    val mutableList3 = mutableListOf<String>()

    //добавляем через цикл в третий с проверкой и continue

    val setMap = mapOf(setOf("StringSet1") to 10, setOf("StringSet2", "StringSet3") to 11)

    println(setMap[setOf("StringSet1")])
val weapon = inventory["Weapon"]
    weapon?.add("Programmer's Sword")

    inventory["Weapon"]?.add ("Programmer's Sword")
    inventory["Weapon"]?.remove ("Rifle")
    println(inventory)
}

//график: дни недели + списки сотрудников
val schedule: Map<String, List<String>> = mapOf()

//название предметов: список доступных курсов и описания
val studentCourses: Map<String, MutableMap<String, String>> = mapOf()

//категории товаров: множество в каждой категории
val inventory: Map<String, MutableSet<String>> = mapOf("Weapon" to mutableSetOf("Gun", "Rifle"))

//расписание транспорта: ключи - номера маршрутов, значения - расписание
val transportSchedule: MutableMap<String, String> = mutableMapOf()