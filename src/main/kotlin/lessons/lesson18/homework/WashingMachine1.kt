package lessons.lesson18.homework

class WashingMachine1 :
    OpenableAndSettableTempEquipment(),
    WaterConnection,
    Drainable {
    override fun connectToWaterSupply() {
        println("The water supply is now connected.")
    }

    override fun getWater(amount: Int) {
        println("The water is being pumped.")
    }

    override fun connectToDrain() {
        println("The drain pipe is in place.")
    }

    override fun drain() {
        println("The water is being drained.")
    }

}

fun main() {
    val washingMachine1 = WashingMachine1()
    washingMachine1.powerOn()
    washingMachine1.connectToDrain()
    washingMachine1.programAction("Washing")
    washingMachine1.setTemperature(40)
    washingMachine1.close()
    washingMachine1.execute()
    washingMachine1.connectToWaterSupply()
    washingMachine1.getWater(10)
    washingMachine1.open()
    washingMachine1.powerOff()
    washingMachine1.programAction("Tumble drying")
}