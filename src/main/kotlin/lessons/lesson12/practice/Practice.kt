package lessons.lesson12.practice

fun main() {

//Практические задания
//Задачи на приведение коллекции к значению
//1. Проверить, что размер коллекции больше 5 элементов.

    val ex1 = listOf(1, 2, 3, 4, 5)
    println(ex1.size > 5)

//2. Проверить, что коллекция пустая

    println(ex1.isEmpty())

//3. Проверить, что коллекция не пустая

    println(ex1.isNotEmpty())

//3. Взять элемент по индексу или создать значение если индекса не
//существует

    println(ex1[1])
    println(ex1.getOrElse(1) { 123 })

//4. Собрать коллекцию в строку

    println(ex1.joinToString())

//4. Посчитать сумму всех значений

    println(ex1.sum())

//5. Посчитать среднее

    println(ex1.average())

//6. Взять максимальное число

    println(ex1.maxOrNull())

//7. Взять минимальное число

    println(ex1.minOrNull())

//8. Взять первое число или null

    println(ex1.firstOrNull())

//9. Проверить что коллекция содержит элемент

    println(ex1.contains(1))
    println(1 in ex1)

//Задачи на обработку коллекций
//1. Отфильтровать коллекцию по диапазону 18-30

    ex1.filter { it in 18..30 }

//2. Выбрать числа, которые не делятся на 2 и 3 одновременно

    ex1.filterNot { it % 6 == 0 }
    ex1.filterNot { it % 2 == 0 && it % 3 == 0 }

//3. Очистить текстовую коллекцию от null элементов

    val ex2: List<String?> = listOf("hi", null, "misunderstood", null, "5")
    ex2.filterNotNull()

//4. Преобразовать текстовую коллекцию в коллекцию длин слов

    val a = ex2.mapNotNull { it?.length }

//5. Преобразовать текстовую коллекцию в мапу, где ключи - слова,
//а значения - перевёрнутые слова

    val ex3 = listOf("text", "text1", "text2")
    println(ex3.associateWith { it.reversed() })

//6. Отсортировать список в алфавитном порядке

    ex3.sorted()

//7. Отсортировать список по убыванию

    ex3.sortedDescending()

//8. Распечатать квадраты элементов списка

    ex1.forEach {
        print("-")
        println(it * it)
        print("aaa")
    }

//9. Группировать список по первой букве слов

    println(ex3.groupBy {
        it[0]
    })

//10. Очистить список от дублей

    ex3.distinct()

//11. Взять первые 3 элемента списка

    ex3.take(3)

//12. Взять последние 3 элемента списка

    ex3.takeLast(3)

}