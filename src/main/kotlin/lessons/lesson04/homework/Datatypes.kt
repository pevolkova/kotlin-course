val v1: Byte = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"
//false должно быть строчными буквами
// val v6: Boolean = FALSE
val v7: Char = 'c'
val v8: Short = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
//не должно быть кавычек, только если не имелась в виду строка с выводом слова true
// val v13: Boolean = "true"
val v14: List <Int> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set <String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f
//не должно быть кавычек
// val v20: Double = `1.414`
val v21: String = "Artificial Intelligence"
val v22: Array <Any> = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"
//false должно быть строчными буквами
//val v30: Boolean = FALSE
val v31: Double = 0.007
//кавычки должны быть прямые
//val v32: String = “🤯”
//у true и false не должно быть кавычек
// val v33: Map (Boolean, Short) = mapOf("true" to 2, "false" to 34)
//не должно быть кавычек
// val v34: Int = ‘65535’
val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
//у true и false не должно быть кавычек
// val v39: Map (Int, Boolean) = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Short = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f
//true должно быть строчными буквами
// val v44: Boolean = TRUE

// Подбери подходящий тип, который будет:
// 1. Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
//Char
// 2. Хранить количество ложек сахара, которые я кладу в одну чашку чая.
//Byte
// 3. Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
//List<Double>
// 4. Хранить длину очереди в столовой до миллиардной доли сантиметра.
//Double
// 5. Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
//Boolean
// 6. Хранить количество свистков чайника за день.
//Short
// 7. Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
//Long
// 8. Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
//Long
// 9. Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
//Double
// 10. Хранить словарь «название стартапа → сумму потерь инвесторов».
//Map<String, Double>
// 11. Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
//String
// 12. Хранить список тем для митингов, которые на самом деле никому не нужны.
//List<String>