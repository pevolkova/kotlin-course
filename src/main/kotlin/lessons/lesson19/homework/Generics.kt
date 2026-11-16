package lessons.lesson19.homework

//Напиши функцию getMiddleElement с дженериком, которая будет
//принимать список и возвращать средний элемент, если он
//существует, иначе возвращать null. Например, у списка из четырёх
//элементов - среднего элемента нет.

fun main() {
    println(getMiddleElement(listOf("Каша", "Дерево", "Трапеция")))
}

fun <T> getMiddleElement(a: List<T>): T? {
    return if (a.size % 2 != 0) {
        a[a.size / 2]
    } else {
        null
    }
}

//Создай функцию transposition с двумя дженериками, которая принимает
//словарь с дженериками и возвращает словарь, в котором ключ и значения
//поменялись местами.

fun <T, R> transposition(incomingMap: Map<T, R>): Map<R, T> {
    return mapOf()
}