package lessons.lesson17.practice

class ATM {
    private var balance: Double = 0.0
    private var pinCode: String = "0000"

    fun getBalance (pinCode: String): Double {
        if (this.pinCode == pinCode) {
            return balance
        }
        return 0.0
    }
}