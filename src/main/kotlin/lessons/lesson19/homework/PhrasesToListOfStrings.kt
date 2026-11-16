package lessons.lesson19.homework

//Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с
//типами String и List<String>. Метод преобразования должен разбивать
//входящую строку по символу пробела и возвращать список из полученных слов.
//Метод преобразования списков с аналогичной механикой.

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun convert(incoming: String): List<String> {
        return incoming.split(" ")
    }

    override fun convertList(incomingList: List<String>): List<List<String>> {
        val resultingList = mutableListOf<List<String>>()
        for (i in incomingList) {
            val newIncoming = convert(i)
            resultingList.add(newIncoming)
        }
        return resultingList
    }
}