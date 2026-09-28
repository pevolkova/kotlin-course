fun main() {
    range()
    evenRange()
    evenRange1()
    reverse()
    reverse1()
    reverseMinus()
    step2()
    step3()
    size()
    squares()
    subtraction()
    firstDo()
    firstDo1()
    numbers()
    evenNumbers()
    evenRange1()
}

//Задания для цикла for
//Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
fun range() {
    val range = 1..5
    for (i in range) {
        println(i)
    }
}

//Напишите цикл for, который выводит четные числа от 1 до 10.
fun evenRange() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}

fun evenRange1() {
    for (i in 1..5) {
        println(i * 2)
    }
}

//Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
fun reverse() {
    for (n in 5 downTo 1) {
        println(n)
    }
}

fun reverse1() {
    for (m in 1..5) {
        println(6 - m)
    }
}

//Создайте цикл for, который выводит числа от 10 до 1,
//уменьшая их на 2.
fun reverseMinus() {
    for (j in 10 downTo 1) {
        println(j - 2)
    }
}

//С шагом (step)
//Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
fun step2() {
    for (i in 1..9 step 2) {
        println(i)
    }
}

//Напишите цикл for, который выводит каждое третье число
//в диапазоне от 1 до 20.
fun step3() {
    for (s in 1..20 step 3) {
        println(s)
    }
}

//Использование до (until)
//Создайте числовую переменную 'size'. Используйте цикл for
//с шагом 2 для вывода чисел от 3 до size не включая size.
fun size() {
    val size: Int = 58
    for (o in 3..<size step 2) {
        println(o)
    }
}

//Задания для цикла while
//Цикл while
//Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun squares() {
    var counter = 0
    while (++counter <= 5) {
        println(counter * counter)
    }
}

//Напишите цикл while, который уменьшает число от 10 до 5.
//После этого вывести результат в консоль
fun subtraction() {
    var counter = 10
    while (--counter !=5)
    println(counter)
}

//Цикл do while
//Используйте цикл do while, чтобы вывести числа от 5 до 1.
fun firstDo() {
    var counter = 5
    do {
        println(counter)
    } while (counter-- > 1)
}

//Создайте цикл do while, который повторяется, пока счетчик
//меньше 10, начиная с 5.
fun firstDo1() {
    var counter = 5
       do {
        println(counter)
    } while (++counter < 10)
}

//Задания для прерывания и пропуска итерации
//Использование break
//Напишите цикл for от 1 до 10 и используйте break, чтобы выйти
//из цикла при достижении 6.
fun breaking () {
    for (q in 1..10) {
        if (q == 6) break
        println(q)
    }
}
//Создайте цикл while, который бесконечно выводит числа,
//начиная с 1, но прерывается при достижении 10.
fun numbers () {
    var counter = 0
    while (true) {
        if (++counter == 10) break
        println(counter)
    }
}
//Использование continue
//В цикле for от 1 до 10 используйте continue, чтобы пропустить
//четные числа.
fun evenNumbers() {
    for (b in 1..10) {
        if (b % 2 == 0) continue
        println(b)
    }
}
//Напишите цикл while, который выводит числа от 1 до 10,
//но пропускает числа, кратные 3.
fun evenNumbers1() {
    var counter = 0
    while (++counter <= 10) {
        if (counter % 3 == 0) continue
        println(counter)
    }
}

//Задача повышенной сложности (разбирается отдельно от основной
//домашки и награждается отдельным стимом за разбор). Её выполнять
//по желанию, проверка не выполняется.
//
//Используя вложенный цикл реализовать таблицу умножения, как
//на картинке.
//
//
//Напишите функцию, которая суммирует числа от 1 до 'arg'
//с помощью цикла for. 'arg' - целочисленный аргумент функции.
//Напишите функцию, которая вычисляет факториал числа 'arg'
//с использованием цикла while.
//Напишите функцию, которая находит сумму всех четных чисел
//от 2 до 'arg', используя цикл while.
//Напишите функцию, которая используя вложенные циклы while,
//выведет заполненный прямоугольник размером 5x3 из символов *.
//Напишите функцию, которая используя цикл for найдёт суммы
//чётных и нечётных значений чисел от 1 до arg.