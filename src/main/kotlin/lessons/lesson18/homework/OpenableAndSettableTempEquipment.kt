package lessons.lesson18.homework

abstract class OpenableAndSettableTempEquipment :
    Openable,
    TemperatureRegulatable,
    ProgrammableEquipment() {
    var isTurnedOn = false

    override fun powerOn() {
        super.powerOn()
        isTurnedOn = true
    }

    override fun powerOff() {
        super.powerOff()
        isTurnedOn = false
    }

    override fun open() {
        println("The equipment has been opened.")
    }

    override fun close() {
        println("The equipment has been closed.")
    }

    override val maxTemperature = 63

    override fun setTemperature(temp: Int) {
        if (isTurnedOn) {
            println("The temperature has been set at $temp.")
        } else {
            println("Turn on the equipment first.")
        }
    }

    override fun programAction(action: String) {
        if (isTurnedOn) {
            super.programAction(action)
        } else {
            println("Turn on the equipment first.")
        }
    }

}