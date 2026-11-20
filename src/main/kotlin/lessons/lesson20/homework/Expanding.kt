package lessons.lesson20.homework

import kotlin.math.absoluteValue

//1. Определите функцию-расширение для массива чисел, которая не принимает
//аргументов и возвращает пару из чисел - первое и последнее. Если массив был
//пуст, то вернуть пару из null значений.

fun Array<Int>?.pair(): Pair<Int?, Int?> {
    return if (this == null) {
        null to null
    } else {
        first() to last()
    }
}

fun Array<Int>.pair1(): Pair<Int?, Int?> {
    return firstOrNull() to lastOrNull()
}

//2. Создайте функцию-расширение для изменяемого списка элементов:
//1. с дженериком T ограниченным интерфейсом Comparable<T>
//2. которая принимает булево значение
//3. возвращает этот же список только в виде неизменяемого
//4. сам изменяемый список при этом должен стать отсортированным по возрастанию,
//если в функцию передано true и по убыванию, если false (используем функции sort()
//и sortDescending()

fun <T : Comparable<T>> MutableList<T>.notMutable(isAscending: Boolean): List<T> {
    return if (isAscending) {
        sorted()
    } else {
        sortedDescending()
    }
}


//3. Создайте функцию-расширение для nullable словаря с дженериком:
//1. Ключ является дженериком
//2. Значение является списком из дженериков
//3. Принимает целое число
//4. Возвращает nullable словарь из ключей изначального словаря приведённых
//к строке через toString()
//5. Значений из nullable дженерика, взятых из изначального ключа-списка
//по индексу из аргумента, если такого индекса нет - значением будет null

fun <T, R> Map<T, List<R>>?.mapToString(arg: Int): Map<String, R?>? {
    if (this == null) {
        return null
    } else {
        val result = mutableMapOf<String, R?>()
        for ((key, value) in this) {
            result[key.toString()] = value.getOrNull(arg)
        }
        return result
    }
}

//4. Реализуйте метод расширения within для класса Number, который проверяет,
//что текущее число отклоняется от эталонного не более допустимого значения.
//Метод принимает два параметра: other — число для сравнения и deviation —
//максимально допустимое отклонение. Метод должен возвращать true, если разница
//между текущим числом и числом для сравнения не превышает заданное отклонение.
//Протестируйте функцию на разных типах чисел. Для получения отклонения, у разницы
//чисел нужно вызвать свойство absoluteValue.

fun Number.within(other: Number, deviation: Number): Boolean {
    val actual = toDouble() - other.toDouble()
    return actual.absoluteValue <= deviation.toDouble()
}


//5. Реализуйте для класса String два метода расширения: encrypt и decrypt. Метод
//encrypt должен сдвигать каждый символ исходной строки на заданное число позиций
//вперед по таблице Unicode, а метод decrypt — на то же число позиций назад. Оба
//метода принимают один параметр base типа Int, который определяет величину сдвига.
//Протестируйте вашу реализацию, убедившись, что после шифрования и последующей
//расшифровки строка возвращается к исходному состоянию.
//Сдвиг по таблице Unicode реализуется простым прибавлением или вычитанием размера
//сдвига к char символу.

fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

//6. Многие уже знают любимую игру в Твиттере - собирание разных слов из букв через
//ответы (но мы то знаем что слово только одно, но не будем его называть). Напиши
//метод расширения строки, который будет принимать список имён пользователей и
//выводить в консоли исходную строку побуквенно в верхнем регистре в столбик: имя
//автора и букву под ним. Вот ссылка на референс:
//https://x.com/SadNSober_/status/1370280031616897026
//Если ссылка не открывается по понятным причинам, вот скриншот

fun String.twitterize(authors: List<String>) {
    var counter = 0
    for (l in this) {
        println(authors[counter++])
        println(l.uppercase())
        println()
        if (counter >= authors.size) {
            counter = 0
        }
    }
}


fun main() {
    println(arrayOf(1, 7, 23, 15).pair())
    println(null.pair())
    println(mutableListOf(4, 6, 709, 1).notMutable(true))
    println(mutableListOf("Окно", "Словарь", "Улица", "Магазин").notMutable(false))
    val map = mapOf(
        "t" to listOf(2, 3, 7),
        "r" to listOf(3, 4),
        "7" to listOf(8, 9)
    )
    println(map.mapToString(0))
    println(map.mapToString(2))
    val nullMap: Map<Int, List<String>>? = null
    println(nullMap.mapToString(0))
}