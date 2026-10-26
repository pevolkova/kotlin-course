package lessons.lesson15.homework

import lessons.lesson09.homework.add

//Третий класс при добавлении строки должен отсортировать весь список
//материалов в алфавитном порядке включая добавляемый материал.

class Sorting : Materials() {
    fun addAndSort(added: String) {
        addMaterial(added)
        val addedAndSorted = extractMaterials().sorted()
        println(addedAndSorted)
    }
}