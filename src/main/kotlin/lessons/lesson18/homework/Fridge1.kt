package lessons.lesson18.homework

import java.io.InputStream

class Fridge1 :
    OpenableAndSettableTempEquipment(),
    Powerable,
    LightEmitting {

    override fun emitLight() {
        println("I'm emitting light.")
    }

    override fun completeLiteEmission() {
        println("The light source is off.")
    }

}

fun main() {
    val fridge1 = Fridge1()
    fridge1.powerOn()
    fridge1.programAction("Freezing")
    fridge1.setTemperature(-18)
    fridge1.execute()
    fridge1.open()
    fridge1.emitLight()
    fridge1.close()
    fridge1.completeLiteEmission()
    fridge1.powerOff()
    fridge1.setTemperature(-5)
}