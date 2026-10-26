package lessons.lesson14.homework

class Concert(
    val group: String,
    val venue: String,
    var price: Double,
    val capacity: Int,

    ) {
    private var ticketsSold: Int = 0

    fun concertInfo() {
        println(
            "The concert of $group will take place at $venue. " +
                    "Ticket prices start from $price, and the venue can welcome $capacity people."
        )
    }

    fun buyTicket() {
        if (capacity > ticketsSold) {
            ticketsSold++
        }
        println(ticketsSold)
    }
}