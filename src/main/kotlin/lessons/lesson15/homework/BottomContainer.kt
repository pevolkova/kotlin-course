package lessons.lesson15.homework

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

class BottomContainer : Materials() {
    fun addBottom() {
        val extracted = extractMaterials()
        val mutableExtracted = extracted.toMutableList()
        mutableExtracted.add(0, "Changed String")
        mutableExtracted.forEach {
            addMaterial(it)
        }

        printContainer()

    }
}