package dataClasses
/*
Написать программу по продаже билетов в кино. Пользователь покупает билет, в который заносятся данные названия фильма,
места и времени начала сеанса. Проданные билеты заносятся в массив архива. По желанию можно вывести все проданные билеты на фильм.
Программа должна запрашивать название фильма, номер ряда и время сеанса у пользователя, а не брать из кода.
* */



fun main() {
    var continueSelling = true
    val soldTickets = mutableListOf<Ticket>()

    while (continueSelling) {
        println("Введите название фильма:")
        val movieTitle = readLine().orEmpty()

        if (movieTitle.isBlank()) {
            println("Название фильма не может быть пустым.")
            continue
        }

        println("Введите номер ряда:")
        val rowNumber = try {
            readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Номер ряда должен быть числом")
        } catch (e: NumberFormatException) {
            println("Ошибка ввода номера ряда. Пожалуйста, введите число.")
            continue
        }

        println("Введите номер места:")
        val seatNumber = try {
            readLine()?.toIntOrNull() ?: throw IllegalArgumentException("Номер места должен быть числом")
        } catch (e: NumberFormatException) {
            println("Ошибка ввода номера места. Пожалуйста, введите число.")
            continue
        }

        println("Введите время начала сеанса (в формате ЧЧ:ММ):")
        val startTime = readLine().orEmpty()

        if (startTime.isBlank()) {
            println("Время начала сеанса не может быть пустым.")
            continue
        }

        // Создаем новый объект билета
        val ticket = Ticket(movieTitle, rowNumber, seatNumber, startTime)

        // Добавляем билет в список проданных билетов
        soldTickets.add(ticket)

        println("Билет успешно продан!")

        println("Хотите продать еще один билет? (да/нет)")
        val answer = readLine().orEmpty().lowercase()

        if (answer == "нет") {
            continueSelling = false
        }
    }

    println("\nСписок всех проданных билетов:")
    for ((index, ticket) in soldTickets.withIndex()) {
        println("${index + 1}. Фильм: ${ticket.movieTitle}, ряд: ${ticket.rowNumber}, место: ${ticket.seatNumber}, начало: ${ticket.startTime}")
    }
}