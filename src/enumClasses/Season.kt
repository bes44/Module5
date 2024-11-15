package enumClasses

import java.util.Scanner

/**
 * 1. Написать программу, которая будет включать несколько классов и enum. Ход работы следующий.
 * При запуске среда просит ввести месяц года. После ввода месяца и нажатия на enter, на консоль выводится время года,
 * которому соответствует этот месяц. После этого программа вновь спросит желаете продолжить или закончить программу:
 * 1. Продолжить; 2. Закончить программу. Если нажимаем продолжить, то программа вновь просит ввести месяц и цикл повторяется.
 * 2. Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.
 */


enum class Season {
    WINTER, SPRING, SUMMER, AUTUMN
}



fun main() {
    println("Задание 1")
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Введите номер месяца (1-12):")
        val monthNumber = scanner.nextInt()

        val month = Month.fromInt(monthNumber)
        if (month != null) {
            println("Это месяц ${month.name.toLowerCase().capitalize()}, время года: ${month.season}")
        } else {
            println("Некорректный номер месяца.")
        }

        println("Желаете продолжить или закончить программу? 1. Продолжить; 2. Закончить программу.")
        val choice = scanner.nextInt()
        if (choice == 2) break
    }
    println("Задание 2")
    val input = "Шумоизоляция"
    val charCount = mutableMapOf<Char, Int>()
    for (char in input) { charCount[char] = charCount.getOrDefault(char, 0) + 1 }
    val repeatingChars = charCount.filter { it.value > 1 }
    println("Повторяющиеся символы: $repeatingChars")

}
