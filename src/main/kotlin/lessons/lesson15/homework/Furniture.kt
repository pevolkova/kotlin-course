package lessons.lesson15.homework

abstract class Furniture(
    val material: String
) {
}

open class HomeFurniture(
    val roomName: String,
    material: String
) : Furniture(material)

class BedroomFurniture(
    val name: String,
    roomName: String,
    material: String
) : HomeFurniture(roomName, material)