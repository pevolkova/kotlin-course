package lessons.lesson09.homework

fun main() {
    double()
    intArray()
    miscellaneous()
    copyArray()
    subtraction()
    example()
    evens()
    search()
    add()
    delete()
    print()
    second()
    position()
    join()
    minMax()
    evenNumbers()
    addition()
    removal()
    printNums()
    printBoolean()
    convert()
}

//Работа с массивами Array
//1. Создайте массив из 5 целых чисел и инициализируйте его
//значениями от 1 до 5.
val ex1: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//2. Создайте пустой массив строк размером 10 элементов.
val ex2 = Array(10) { "" }

//3. Создайте массив из 5 элементов типа Double и заполните его
//значениями, являющимися удвоенным индексом элемента.
val ex3 = DoubleArray(5)
fun double() {
    for (index in ex3.indices) {
        ex3[index] = index * 2.toDouble()
    }
    println(ex3.joinToString(", "))
}

//4. Создайте массив из 5 элементов типа Int. Используйте цикл,
//чтобы присвоить каждому элементу значение, равное его индексу,
//умноженному на 3.
fun intArray() {
    val intArray = IntArray(5)
    for (index in intArray.indices) {
        intArray[index] = index * 3
    }
    println(intArray.joinToString(", "))
}

//5. Создайте массив из 3 nullable строк. Инициализируйте его
//одним null значением и двумя строками.
fun miscellaneous() {
    val miscellaneous: Array<String?> = arrayOfNulls<String>(3)
    miscellaneous[0] = "Kotlin is fun"
    miscellaneous[1] = null
    miscellaneous[2] = "The weather is nasty"
    val result =
        (miscellaneous[0] ?: "Hey, people") + "; " + (miscellaneous[1] ?: "Hey, people") + "; " + (miscellaneous[2]
            ?: "Hey, people")
    println(result)
}

//6. Создайте массив целых чисел и скопируйте его в новый массив
//в цикле.
fun copyArray() {
    val originalArray: Array<Int> = arrayOf(1, 10, 87, -5, 118)
    val copiedArray = IntArray(5)
    for (index in originalArray.indices) {
        copiedArray[index] = originalArray[index]
    }
    println(copiedArray.joinToString(", "))
}

//7. Создайте два массива целых чисел одинаковой длины. Создайте
//третий массив, вычтя значения одного из другого. Распечатайте
//полученные значения.

fun subtraction() {
    val originalArray1 = arrayOf<Int>(9, 87, 113, 59, 18)
    val originalArray2 = arrayOf<Int>(501, -78, 125, 8, 15)
    val resultArray = IntArray(5)
    for (index in originalArray1.indices) {
        resultArray[index] = originalArray1[index] - originalArray2[index]
    }
    println(resultArray.joinToString(", "))
}

//8. Создайте массив целых чисел. Найдите индекс элемента
//со значением 5. Если значения 5 нет в массиве, печатаем -1.
//Реши задачу через цикл while.

fun example() {
    val intArray = arrayOf<Int>(7, 8, 0, 15, 256, 8)
    var i = 0
    var result = -1
    while (i < intArray.size) {
        if (intArray[i] == 5) {
            result = i
            break
        }
        i++
    }
    println(result)
}


//9. Создайте массив целых чисел. Используйте цикл для перебора
//массива и вывода каждого элемента в консоль. Напротив каждого
//элемента должно быть написано “чётное” или “нечётное”.

fun evens() {
    val intArray = arrayOf<Int>(9, 27, 35, 81, 104, 553)
    for (i in intArray) if (i % 2 == 0) {
        println(i.toString() + " четное")
    } else {
        println("$i нечетное")
    }
}

//10. Создай функцию, которая принимает массив строк и строку для
//поиска. Функция должна находить в массиве элемент, в котором
//принятая строка является подстрокой (метод contains()).
//Распечатай найденный элемент.

fun search() {
    val stringArray = arrayOf<String>(
        "Здравствуйте, я ваша тетя!", "Совы нежные", "Тормозите лучше в папу"
    )
    val substring = ""
    var phraseFound = ""
    for (text in stringArray) if (text.contains(substring, ignoreCase = true)) {
        phraseFound = text
        break
    }
    if (substring.isEmpty() || phraseFound == "") {
        println("Поиск не дал результатов")
    } else println(phraseFound)
}

//Работа со списками List
//1. Создайте пустой неизменяемый список целых чисел.

val emptyList = listOf<Int>()

//2. Создайте неизменяемый список строк, содержащий три элемента
//(например, "Hello", "World", "Kotlin").

val regularList = listOf<String>("Hello", "World", "Kotlin")

//3. Создайте изменяемый список целых чисел и инициализируйте его
//значениями от 1 до 5.

val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)

//4. Имея изменяемый список целых чисел, добавьте в него новые
//элементы (например, 6, 7, 8).

fun add() {
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)
    println(mutableList)
}

//5. Имея изменяемый список строк, удалите из него определенный
//элемент (например, "World").

fun delete() {
    val mutableList = mutableListOf<String>("People", "Imagine", "World", "Circumference")
    mutableList.remove("World")
    println(mutableList)
}

//6. Создайте список целых чисел и используйте цикл для вывода
//каждого элемента на экран.

fun print() {
    val listInt = listOf<Int>(8, 90, 44, -19, 65)
    for (i in listInt) {
        println(i)
    }
}

//7. Создайте список строк и получите из него второй элемент,
//используя его индекс.

fun second() {
    val stringList = listOf<String>("Январь", "Февраль", "Октябрь", "Каникулы", "Мастер-класс")
    println(stringList[1])
}

//8. Имея изменяемый список чисел, измените значение элемента на
//определенной позиции (например, замените элемент с индексом
//2 на новое значение).

fun position() {
    mutableList[2] = 8
    println(mutableList)
}

//9. Создайте два списка строк и объедините их в один новый список,
//содержащий элементы обоих списков. Реши задачу с помощью циклов.

fun join() {
    val listString = listOf<String>("С новым годом!", "Вечный студент", "Корабли в моей гавани")
    val listString1 = listOf<String>("Как дела?", "Третий лишний", "Пока!", "Удачи!")
    val finalList = mutableListOf<String>()
    for (i in listString) {
        finalList.add(i)
    }
    for (i in listString1) finalList.add(i)
    println(finalList)
}

//10. Создайте список целых чисел и найдите в нем минимальный и
//максимальный элементы используя цикл.

fun minMax() {
    val minMax = listOf<Int>(97, 20, -765, 81, 1384)
    var i = 0
    var min = minMax[0]
    var max = minMax[0]
    while (i < minMax.size) {
        if (minMax[i] < min) min = minMax[i]
        if (minMax[i] > max) max = minMax[i]
        i++
    }
    println("Минимальное число: $min, максимальное число: $max")
}

//11. Имея список целых чисел, создайте новый список, содержащий
//только четные числа из исходного списка используя цикл.

fun evenNumbers() {
    val list1 = listOf<Int>(9, 85, 101, 983, 94, 36, 257, -4)
    val finalList = mutableListOf<Int>()
    for (i in list1) if (i % 2 == 0) finalList.add(i)
    println(finalList)
}

//Работа с Множествами Set
//1. Создайте пустое неизменяемое множество целых чисел.

val emptySet = emptySet<Int>()

//2. Создайте неизменяемое множество целых чисел, содержащее три
//различных элемента (например, 1, 2, 3).

val intSet = setOf<Int>(5, 8, 13)

//3. Создайте изменяемое множество строк и инициализируйте его
//несколькими значениями (например, "Kotlin", "Java", "Scala").

val mutableSet = mutableSetOf<String>("Scala", "Kotlin", "Java")

//4. Имея изменяемое множество строк, добавьте в него новые
//элементы (например, "Swift", "Go").

fun addition() {
    mutableSet.add("Swift")
    mutableSet.add("Go")
    println(mutableSet)
}

//5. Имея изменяемое множество целых чисел, удалите из него
//определенный элемент (например, 2).

val mutableSetNums = mutableSetOf<Int>(9, -35, -41, 2, 63, 91)
fun removal() {
    mutableSetNums.remove(2)
    println(mutableSetNums)
}

//6. Создайте множество целых чисел и используйте цикл для вывода
//каждого элемента на экран.

val setNums = setOf<Int>(11, -501, 249, 1314, 5)
fun printNums() {
    for (i in setNums) {
        println(i)
    }
}

//7. Создай функцию, которая принимает множество строк (set) и
//строку и проверяет, есть ли в множестве указанная строка.
//Нужно распечатать булево значение true если строка есть.
//Реши задачу через цикл.

fun printBoolean() {
    val setStrings = setOf<String>("Дед Мазай", "зайцы", "зима", "лодка", "бедствие")
    val testString = "зайцы"
    var result: Boolean = false
    for (i in setStrings) {
        if (i.equals(testString, ignoreCase = true) && testString.isNotEmpty()) {
            result = true
            break
        }
    }
    println(result)
}

//8. Создайте неизменяемое множество строк и конвертируйте его
//в изменяемый список строк с использованием цикла.

val unmutableSet = setOf<String>("Party", "New Year", "Beach", "Birthday")
fun convert() {
    val mutableList = mutableListOf<String>()
    for (i in unmutableSet) {
        mutableList.add(i)
    }
    println(mutableList)
}