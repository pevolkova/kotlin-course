package lessons.lesson15.homework

//Это класс контейнера. Он абстрактный, это означает, что нельзя создавать экземлпяр этого класса,
//он нужен только для того, чтобы быть основой для подклассов.
//
//Создай подклассы этого контейнера, которые будут добавлять строку material (или коллекции или
//словари строк) в какое-то определённое место (места).

fun main() {
    val bottomContainer = BottomContainer()
    bottomContainer.addBottom()

    val alternatingStrings = AlternatingStrings(
        listOf(
            "String8",
            "String9",
            "String10"
        )
    )
    alternatingStrings.alternatingStrings()

    val sorting = Sorting()
    sorting.addAndSort("String11")

    val firstAndLast = FirstAndLast()
    firstAndLast.firstAndLast(mapOf(
        1 to "String31",
        2 to "String32",
        3 to "String33"))
}

abstract class Materials {
    private val materials = mutableListOf(
        "String1",
        "String8",
        "String3",
        "String0"
    )

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}