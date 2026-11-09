package lessons.lesson18.homework

abstract class ProgrammableEquipment() :
    PowerableEquipment(),
    Programmable {

    override fun programAction(action: String) {
        println("The $action has been programmed.")
    }

    override fun execute() {
        println("The execution has been completed.")
    }
}
