package dataClasses
/*
Написать программу по продаже билетов в кино. Пользователь покупает билет, в который заносятся данные названия фильма,
места и времени начала сеанса. Проданные билеты заносятся в массив архива. По желанию можно вывести все проданные билеты на фильм.
* */
class Cinema {
    private val soldTickets = mutableListOf<Ticket>()

    fun sellTicket(movieTitle: String, hall:String, row:String, seat: String, startTime: String) {
        val ticket = Ticket(movieTitle,hall, row, seat, startTime)
        soldTickets.add(ticket)
        println("Билет на фильм '$movieTitle' продан. Зал: $hall, Ряд: $row, Место: $seat, Время начала: $startTime")
    }

    fun showSoldTickets(movieTitle: String) {
        val ticketsForMovie = soldTickets.filter { it.movieTitle == movieTitle }
        if (ticketsForMovie.isEmpty()) {
            println("Билетов на фильм '$movieTitle' не найдено.")
        } else {
            println("Проданные билеты на фильм '$movieTitle':")
            ticketsForMovie.forEach { ticket ->
                println("Зал: ${ticket.hall}, Ряд: ${ticket.row}, Место: ${ticket.seat}, Время начала: ${ticket.startTime}")
            }
        }
    }
}

fun main() {
    val cinema = Cinema()
    cinema.sellTicket("Серый волк", "Зеленый","10", "10", "18:00")
    cinema.sellTicket("Серый волк", "Зеленый","10", "11", "18:00")
    cinema.sellTicket("Начало", "Синий","10","10", "20:00")

    println()
    cinema.showSoldTickets("Серый волк")
    println()
    cinema.showSoldTickets("Начало")
    println()
    cinema.showSoldTickets("Летучий корабль")
}
