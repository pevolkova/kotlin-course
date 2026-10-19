package lessons.lesson13.homework

fun main() {

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод,
//не повторяясь с решением других задач.
//
//1. Дан словарь с именем и временем выполнения каждого автоматизированного теста
//в секундах. Определите среднее время выполнения теста.

    println(
        mapOf("a" to 35, "b" to 11, "c" to 27, "d" to 4).values
            .average()
    )

//2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена
//тестовых методов, а значения - строка с метаданными. Выведите список всех тестовых
//методов.

    println(
        mapOf("a" to "regression", "b" to "critical", "c" to "smoke").keys
    )

//3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его
//результат.

    val testMap = mutableMapOf("test1" to "passed", "test2 Optional" to "skipped")
    fun mapAddition(testMap: MutableMap<String, String>) {
        testMap["test3 optional"] = "Failed"
        testMap.put("test4", "passed")
        println(testMap)
    }

    mapAddition(testMap)

//4. Посчитайте количество успешных тестов в словаре с результатами (ключ - название,
//значение - результат из passed, failed, skipped).

    val result = testMap.filterValues { it == "passed" }.count()
    println(result)

//5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен
//(ключ - название, значение - статус исправления).

    val bugMap =
        mutableMapOf<String, String>("bug1" to "open", "bug2" to "closed", "bug3" to "not started", "bug4" to "closed")
    bugMap.remove("bug2")
    println(bugMap)

//    bugMap.values.removeIf { it == "closed" }
//    println(bugMap)

    val bugUpdated = bugMap.filterValues { it == "closed" }
    for ((key, value) in bugUpdated) {
        bugMap.remove(key)
    }
    println(bugMap)

//6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы,
//значение — статус ответа), выведите сообщение о странице и статусе её проверки.

    val mapWebpages = mapOf(
        "google.com" to "positive", "facebook.com" to "negative",
        "habr.com" to "positive"
    )
    mapWebpages.forEach { (webpage, status) ->
        println("$webpage says $status")
    }

    mapWebpages.forEach {
        println("${it.key} says ${it.value}")
    }

//7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа
//которых превышает заданный порог.

    println(
        mapOf(
            "service1" to 30, "service2" to 24, "service3" to 18,
            "service4" to 33
        ).filterValues { it > 25 }
    )

//8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус
//ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint
//отсутствует, предположите, что он не был протестирован.

    val apiResults = mapOf(
        "/api/login" to "200", "/api/users" to "404",
        "/api/orders/" to "500"
    )
    println(apiResults.getOrDefault("/api/main/", "not tested"))

    println(apiResults.getOrElse("/api/main") {
        "not tested"
    })

//9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра
//конфигурации, значение - сама конфигурация), получите значение для "browserType".
//Ответ не может быть null.

    val testConfig = mutableMapOf(
        "browser" to "chrome",
        "timeout" to "30",
        "language" to "ru"
    )
    println(testConfig.getValue("browser"))

//10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив
//новую версию.

    println(
        mapOf(
            "version1" to "data1", "version2" to "data2",
            "version3" to "data3"
        ) + ("version4" to "data4")
    )

//11. Используя словарь с настройками тестирования для различных мобильных устройств
//(ключ — модель устройства, значение - строка с настройками), получите настройки для
//конкретной модели или верните настройки по умолчанию.

    println(
        mapOf(
            "Pixel 8" to "Android 14, 1080x2400, portrait",
            "iPhone 15" to "iOS 17, 1179x2556, portrait",
            "Galaxy S24" to "Android 14, 1080x2340, landscape",
        ).getOrDefault("Pixel 9", "Android 14, 1080x2340, landscape")
    )

//12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки,
//значение - описание ошибки) определенный код ошибки.

    println(
        mapOf(
            "E001" to "Элемент не найден на странице",
            "E002" to "Превышено время ожидания ответа",
            "E003" to "Неверный логин или пароль"
        ).containsKey("E005")
    )

//13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев
//в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed",
//"Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
//идентификаторы которых соответствуют определённой версии тестов, то-есть в ключе
//содержится требуемая версия.

    println(
        mapOf(
            "TC102_v2" to "Passed",
            "TC103_v1" to "Skipped",
            "TC103_v4" to "Failed",
            "TC102_v4" to "Passed",
        ).filter { it.key.endsWith("v4") }
    )

//14. У вас есть словарь, где ключи — это названия функциональных модулей приложения,
//а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным
//тестированием.

    println(
        mapOf(
            "Авторизация" to "Passed",
            "Регистрация" to "Passed",
            "Корзина" to "Failed",
            "Профиль" to "Skipped",
        ).any { it.value.lowercase() == "failed" }
    )

//15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого
//словаря.

    testConfig.putAll(
        mapOf(
            "dbPort" to "5432",
            "baseUrl" to "https://test.example.com"
        )
    )
    println(testConfig)

//16. Объедините два неизменяемых словаря с данными о багах.

    val bugMap1 = mapOf(
        "BUG-101" to "Кнопка «Оплатить» не реагирует на нажатие",
        "BUG-102" to "Приложение падает при повороте экрана",
        "BUG-104" to "Не приходит письмо для сброса пароля"
    )

    val bugMap2 = mapOf(
        "BUG-103" to "Неверно отображается сумма в корзине",
        "BUG-105" to "Текст обрезается на маленьких экранах"
    )

    println(bugMap1 + bugMap2)

//17. Очистите изменяемый словарь с временными данными о последнем прогоне
//автоматизированных тестов.

    val automatedTestMap = mutableMapOf(
        "startTime" to "2026-10-19 05:30:00",
        "endTime" to "2026-10-19 05:42:15",
        "duration" to "12m 15s"
    )
    automatedTestMap.clear()

    println(automatedTestMap)

//18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были
//пропущены (имеют статус “skipped”). Ключи - название теста, значения - статус.

    println(testMap.filterNot {
        it.value.equals("Skipped", ignoreCase = true)
    })

//19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько
//конфигураций.

    println(testConfig)
    println(
        testConfig - listOf(
            "dbPort",
            "baseUrl"
        )
    )

//20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//(ключ — идентификатор теста, значение — результат) в список строк формата "Test ID:
//результат".

    println(testMap)
    println(testMap.map { "${it.key}: ${it.value}" })

//21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый
//для архивации.

    val archivedMap = testMap.toMap()
    println(archivedMap)

//22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения
//тестов, заменив идентификаторы тестов на их строковый аналог (например через
//toString()).

    val automatedTestMap1 = mapOf(
        1 to "15 s",
        2 to "78 s",
        3 to "21 s"
    )
    println(automatedTestMap1.mapKeys { it.key.toString() })

//23. Для словаря с оценками производительности различных версий приложения
//(ключи - строковая версия, значения - дробное число времени ответа сервера)
//увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.

    val performanceScores = mapOf(
        "1.0.0" to 72.5,
        "1.1.0" to 78.0,
        "1.2.0" to 81.3
    )
    println(performanceScores.mapValues {
        "%.1f".format(it.value * 1.1)
    })

//24. Проверьте, пуст ли словарь с ошибками компиляции тестов.

    val compilationErrors = mapOf(
        "LoginTest.kt" to "Unresolved reference: loginButton",
        "PaymentTest.kt" to "Expecting ')'",
        "SearchTest.kt" to "Val cannot be reassigned"
    )
    println(compilationErrors.isEmpty())

//25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.

    val loadTestResults = mapOf(
        "100 users" to 0.21,
        "500 users" to 0.48,
        "1000 users" to 0.95
    )
    println(loadTestResults.isNotEmpty())

//26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

//    val allTests = testMap.size
//    val successfulTests = testMap.count {
//        it.value.equals("passed", ignoreCase = true)
//    }
//    println(testMap.isNotEmpty() && allTests == successfulTests)

    println(testMap.isNotEmpty() && testMap.all {
        it.value.equals("passed", ignoreCase = true)
    })

//27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест
//с ошибкой.

    println(testMap.any {
        it.value.equals("failed", ignoreCase = true)
    })

//28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
//которые не прошли успешно и содержат в названии “optional”.

    println(testMap)
    println(testMap.filter {
        !it.value.equals("passed", ignoreCase = true)
                && it.key.contains("optional", ignoreCase = true)
    })

//    val filtered = testMap.filterNot {
//        it.value.equals("passed", ignoreCase = true)
//    }
//    println(filtered.filterKeys {
//        it.contains("optional", ignoreCase = true)
//    })
}