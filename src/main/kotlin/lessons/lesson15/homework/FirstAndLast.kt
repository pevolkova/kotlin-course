package lessons.lesson15.homework

//Четвёртый класс должен принимать словарь (ключи и значения строки).
//Каждая пара ключа и значения должна попадать в контейнер следующим
//образом - ключ в начало, значение в конец. Таким образом в начале должны
//быть ключи в обратном порядке, потом существующие материалы, потом все
//значения.

class FirstAndLast : Materials() {
    fun firstAndLast(added: Map<Int, String>) {
        val workList = extractMaterials()
        val keys = added.keys
        val values = added.values
        println(keys.reversed().toList() + workList + values)
        }
    }