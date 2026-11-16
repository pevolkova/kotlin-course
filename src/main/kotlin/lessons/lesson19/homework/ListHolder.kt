package lessons.lesson19.homework

//Напиши класс ListHolder, который будет хранить список элементов
//типа T и иметь метод для добавления нового элемента и получения
//всех элементов в виде неизменяемого списка.

class ListHolder<T>(listOriginal: List<T>) {
    private val list = listOriginal.toMutableList()
    fun addElementAndGetAll(element: T): List<T> {
        list.add(element)
        val newList = list.toList()
        return newList
    }
}

fun main() {
    val listHolder = ListHolder(mutableListOf(1, 5, 19))
    println(listHolder.addElementAndGetAll(-7))
}