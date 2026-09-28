package lessons.lesson08.homework

//1. Преобразование строк
//Создайте функцию, которая будет анализировать входящие фразы
//и применять к ним различные преобразования, делая текст более
//ироничным или забавным. Функция должна уметь распознавать
//ключевые слова или условия и соответственно изменять фразу.
fun main() {
    changes()
    extraction()
    creditCard()
    email()
    extractionName()
    abbreviation()
}

fun changes() {
    val originalPhrase1: String = "Это невозможно выполнить за один день"
    val originalPhrase2: String = "Я не уверен в успехе этого проекта"
    val originalPhrase3: String = "Произошла катастрофа на сервере"
    val originalPhrase4: String = "Этот код работает без проблем"
    val originalPhrase5: String = "Удача"
    val result1 = when {
        originalPhrase1.contains("невозможно") ->
            originalPhrase1.replace(
                "невозможно",
                "совершенно точно возможно, просто " +
                        "требует времени"
            )

        else -> originalPhrase1
    }
    println(result1)

    val result2 = when {
        originalPhrase2.startsWith("Я не уверен") ->
            originalPhrase2 + ", но моя интуиция " +
                    "говорит об обратном"

        else -> originalPhrase2
    }
    println(result2)

    val result3 = when {
        originalPhrase3.contains("катастрофа") ->
            originalPhrase3.replace(
                "катастрофа",
                "интересное событие"
            )

        else -> originalPhrase3
    }
    println(result3)

    val result4 = when {
        originalPhrase4.endsWith("без проблем") ->
            originalPhrase4.replace(
                "без проблем",
                "с парой интересных вызовов на пути"
            )

        else -> originalPhrase4
    }
    println(result4)

    val result5 = when {
        !originalPhrase5.contains(" ") ->
            "Иногда $originalPhrase5, но не всегда"

        else -> originalPhrase5
    }
    println(result5)
}
//Правила проверки и преобразования:
//
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно
//возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция
//говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное
//событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных
//вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после
//слова ", но не всегда".
//Примеры Тестовых Фраз:
//
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"

//2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему
//-> 2021-12-01 09:48:23" (данные могут быть любыми, но формат
// всегда такой). Извлеките отдельно дату и время из этой строки
// и сразу распечатай их по очереди. Используй indexOf или split
// для получения правой части сообщения.

fun extraction() {
    val phrase = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val parts = phrase.split(" -> ")
    val dateAndTime = parts[1]
    val partsDateAndTime = dateAndTime.split(" ")
    val date = partsDateAndTime[0]
    val time = partsDateAndTime[1]

    println(date)
    println(time)
}

//
//3. Маскирование личных данных
//Дана строка с номером кредитной карты, например
//"4539 1488 0343 6467". Замаскируйте все цифры, кроме последних
//четырех, символами "*".

fun creditCard() {
    val cardNo = "4539 1488 0343 6467"
    val cardNoTrimmed = cardNo.substring(15)
    val cardNoSafe = "**** **** **** " + cardNoTrimmed
    println(cardNoSafe)
}
//
//4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com".
//Преобразуйте его в строку "username [at] example [dot] com",
//используя функцию replace()

fun email() {
    val email = "username@example.com"
    val emailFormatted = email.replace("@", " at ").replace(".", " dot ")
    println(emailFormatted)
}

//
//5. Извлечение имени файла из пути.
//Дан путь к файлу, например
//"C:/Пользователи/Документы/report.txt" или
//"D:/good.themes/dracula.theme" (может быть любым).
//Извлеките название файла с расширением.

fun extractionName() {
    val filePath = "C:/Пользователи/Документы/report.txt"
    val parts = filePath.split("/")
    val fileName = parts.last()
    val filePath1 = "D:/good.themes/dracula.theme"
    val lastSlash = filePath1.lastIndexOf ("/")
    val fileName1 = filePath1.substring(lastSlash + 1)
    println(fileName)
    println(fileName1)
}
//
//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык
//программирования" (может быть любой с разделителями
//слов - пробел). Создайте аббревиатуру из начальных букв слов
//(например, "ООП").
//
fun abbreviation () {
    val phrase = "Котлин лучший язык программирования"
    val splitPhrase = phrase.split (" ")
    var abbreviation = ""
    for (word in splitPhrase) {
        val firstLetter = word.substring (0, 1)
        val upperCase = firstLetter.uppercase()
        abbreviation = abbreviation + upperCase
    }
println(abbreviation)
}
//Используйте split. Используйте for для перебора слов.
//Используйте var переменную для накопления первых букв.