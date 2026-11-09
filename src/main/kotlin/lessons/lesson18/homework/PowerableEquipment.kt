package lessons.lesson18.homework

abstract class PowerableEquipment : Powerable {
    override fun powerOn() {
        println("The equipment has been turned on.")
    }

    override fun powerOff() {
        println("The equipment has been turned off.")
    }
}