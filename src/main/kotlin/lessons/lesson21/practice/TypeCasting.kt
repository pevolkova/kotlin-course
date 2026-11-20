package lessons.lesson21.practice

fun main() {
    val ex1: Any = "Hey"
    println(ex1 as String)
    //println(ex1 as Int) // ClassCastException вызовет
    if (ex1 is String) {
        println("This is a string.")
    } else {
        println("This in not a string :(")
    }

    val ex2: Any = listOf<String>("Hey", "t")
    println(ex2 as List<String>) // переменная дженерика теряется в runtime,
    //поэтому ошибки нет, но дальше случится, когда попытаемся с ним работать
//    println(ex2 as List<Int>)
//    println(ex2[0].minus(1))
    if (ex2 is List<String>) {
        println(ex2[1])
    }
    if (ex2[1] is String) {
        println("This is a string.")
    }
    println((ex2[0] as? String) ?: "This is not a string")

    val ex3: String? = null
    println(ex3 as? String)

    fun tryMultiple(arg: Any): Int? {
        if (arg is Int) {
            return arg * 2
        }
        if (arg is String) {
            return arg.toIntOrNull()?.times(2)
        }
        return null
    }

    fun tryMultiple1(arg: Any): Int? {
        return (arg as? Int)?.times(2)
            ?: (arg as? String)?.toIntOrNull()?.times(2)
    }

    println(tryMultiple(3))
    println(tryMultiple("3"))
    println(tryMultiple("three"))
    println(tryMultiple1(3))
    println(tryMultiple1("3"))
    println(tryMultiple1("three"))
}