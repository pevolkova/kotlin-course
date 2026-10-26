package lessons.lesson15.homework

//Второй класс должен получать список строк и вставлять их в начало
//контейнера, но поочерёдно с теми данными, которые уже есть.
//То-есть, наш список должен появиться в контейнере по индексам
//0, 2, 4 и так далее.

//class AlternatingStrings(val newStrings: List<String>) : Materials() {
//
//    fun alternatingStrings() {
//        val extracted = extractMaterials().toMutableList()
//        val result = mutableListOf<String>() //ArrayList<String>(extracted.size + newStrings.size)
//
////        val sizeNew = newStrings.size
//        val sizeOld = extracted.size
//        if (sizeNew > sizeOld) {
//            for (i in 0..<sizeOld) {
//                result.add(newStrings[i])
//                result.add(extracted[i])
//            }
//            for (i in sizeOld + 1..<sizeNew)
//                result.add(newStrings[i])
//        } else {
//            for (i in 0..<sizeNew) {
//                result.add(newStrings[i])
//                result.add(extracted[i])
//            }
//            for (i in sizeNew..<sizeOld) {
//                result.add(extracted[i])
//            }
//        }
//        result.forEach { addMaterial(it) }
//
//        printContainer()
//

//        var a = 0
//        newStrings.forEach {
//            result.add(a, it)
//            a+=2
//        }
//        var a1 = 1
//        extracted.forEach {
//            result[a1] = it
//            a1+=2
//        }
//
//        result.forEach { addMaterial(it) }
//
//        printContainer()
//    }
//}

