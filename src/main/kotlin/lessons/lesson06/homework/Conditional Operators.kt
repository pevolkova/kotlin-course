fun main() {
    season(12)
    season(32)
    season(8)
    season(1)
    petAge(74)
    petAge(-5)
    petAge(2)
    petAge(0)
    petAge(3)
    petAge(20)
    convertedTemp(28.0f, 'C')
    movieAgeSelection(25)
    movieAgeSelection(1)
    movieAgeSelection(-6)
    clothesType(67)
    clothesType(-3)
    clothesType(10)
    documentType(".txt")
    documentType(";")
    documentType(".jpg")
}

//Задание 1: "Определение сезона"
//
//Напишите функцию, которая на основе номера месяца распечатывает
//сезон года. Номера месяцев начинаются с единицы.
fun season(arg: Int) {
    val resultSeason = when (arg) {
        1, 2, 12 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        else -> "Season not defined"
    }
    println(resultSeason)
}

//Задание 2: "Расчет возраста питомца"
//
//Создайте функцию, которая преобразует возраст собаки
//в "человеческие" годы. До 2 лет каждый год собаки равен
//10.5 человеческим годам, после - каждый год равен 4 человеческим
//годам. Результат распечатай в консоль.
fun petAge(arg: Int) {
    if (arg !in 0..<20) {
        println("Age not defined")
    } else {

        val conversionCoefficient1: Double = 10.5
        val conversionCoefficient2: Double = 4.0

        if (arg > 2) {
            val resultAge = conversionCoefficient1 * 2 + conversionCoefficient2 * (arg - 2)
            println(resultAge)
        } else {
            val resultAge = conversionCoefficient1 * arg
            println(resultAge)
        }
    }
}

//
//Задание 3: "Определение способа перемещения"
//
//Напишите функцию, которая печатает в консоль, какой способ
//перемещения лучше использовать, исходя из длины маршрута.
//Если маршрут до 1 км - "пешком", до 5 км - "велосипед",
//иначе - "автотранспорт".
fun transportMode(arg: Double) {
    if (arg <= 0.0) {
        print("Transport mode could not be determined")
    } else {
        if (arg < 1.0) {
            println("On foot")
        } else if (arg in 1.0..<5.0) {
            println("By bike")
        } else {
            println("By car")
        }
    }
}

//
//Задание 4: "Расчет бонусных баллов"
//
//Клиенты интернет-магазина получают бонусные баллы за покупки.
//Напишите функцию, которая принимает сумму покупки и печатает
//в консоль количество бонусных баллов: 2 балла за каждые
//100 рублей при сумме покупки до 1000 рублей и 3 балла за каждые
//100 рублей при сумме свыше этого.
fun bonusPoints(arg: Double) {
    val bonusCoefficient1: Int = 2
    val bonusCoefficient2: Int = 3
    val resultPoints = when {
        arg in 0.0..1000.0 -> println((arg / 100).toInt() * bonusCoefficient1)
        arg > 1000.0 -> println((arg / 100).toInt() * bonusCoefficient2)
        else -> println("Incorrect amount")
    }
}

//
//Задание 5: "Определение типа документа"
//
//В системе хранения документов каждый файл имеет расширение.
//Напишите функцию, которая на основе расширения файла печатает
//в консоль его тип: "Текстовый документ", "Изображение", "Таблица"
//или "Неизвестный тип".
fun documentType(arg: String) {
    when (arg) {
        ".txt", ".rtf", ".docx", ".doc", ".odt" -> println("Text document")
        ".jpg", ".png", ".gif", ".svg", ".webp" -> println("Image")
        ".xlsx", ".xls", ".csv", ".ods" -> println("Spreadsheet")
        else -> println("Unknown type")
    }
}

//
//Задание 6: "Конвертация температуры"
//
//Создайте функцию, которая конвертирует температуру из градусов
//Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы
//измерения (C/F). Единицу измерения нужно передать вторым
//аргументом функции. Несколько аргументов передаются через запятую.
//Распечатай в консоль результат конвертации с добавлением единицы
//измерения. Чтобы добавить единицу измерения после результата,
//используй функцию печати без переноса строки print("C") или print("F").
//
fun convertedTemp(arg1: Float, arg2: Char) {
    if (arg2 == 'C') {
        val resultTemp = arg1 * 1.8f + 32.0f
        println ("$resultTemp F")
    } else if (arg2 == 'F') {
        val resultTemp = (arg1 - 32.0f) / 1.8f
        println ("$resultTemp C")
    } else println ("Conversion failed")
}

//Задание 7: "Подбор одежды по погоде"
//
//Напишите функцию, которая на основе температуры воздуха
//рекомендует тип одежды: "куртка и шапка" при температуре
//ниже +10, "ветровка" от +10 до +18 градусов включительно и
//"футболка и шорты" при температуре выше +18 градусов.
//При температурах ниже -30 и выше +35 рекомендуйте не выходить
//из дома.
//
fun clothesType (arg: Int) {
    when {
        arg < -30 || arg > 35 -> println("Stay home")
        arg < 10 -> println("Wear a coat and a hat")
        arg <= 18 -> println("Wear a light jacket")
        arg > 18 -> println("Wear a T-shirt and shorts")
    }
}
//Задание 8: "Выбор фильма по возрасту"
//
//Кинотеатр предлагает фильмы разных возрастных категорий.
//Напишите функцию, которая принимает возраст зрителя и возвращает
//доступные для него категории фильмов: "детские" (от 0 до 9),
//"подростковые" (от 10 до 18), "18+" для остальных.
fun movieAgeSelection (arg: Int) {
    if (arg in 0..9) {
        println("Movies for kids")
    } else if (arg in 10..<18) {
        println("Movies for teenagers")
    } else if (arg >= 18) {
        println("Movies for adults")
    } else println("Wrong age")
}