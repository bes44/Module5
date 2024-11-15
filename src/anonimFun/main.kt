package anonimFun
/*
1. Написать анонимную функцию – поздравление с наступающим новым годом. Ее тип следующий (String, Int) -> String.
 Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют.
 Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
2. Создать массив целых чисел произвольного размера. Написать анонимную функцию isEven,
 проверяющую число на четность, она возвращает логический тип. Написать функцию checkArrayElement
 проверки массива и его элементов на четность, она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
3. Напишите анонимную функцию для объединения двух строк и возврата результата.
 */

fun checkArrayElements(array: Array<Int>, check: (Int) -> Boolean): List<Boolean> {
    return array.map { check(it) }
}

fun main() {
    println("Задание 1")
    val newYearGreeting: (String, Int) -> String = { name, year ->
        "Дорогой $name, поздравляем тебя с наступающим $year годом! Пусть он принесет много счастья, здоровья и успехов!"
    }

    val greeting = newYearGreeting("Иван", 2025)
    println(greeting)

    println("Задание 2")
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val isEven: (Int) -> Boolean = { it % 2 == 0 }

    val results = checkArrayElements(
        numbers,
        isEven
    )
    println ("Массив: ${numbers.joinToString(", ")}")
    println("Результаты проверки четности элементов массива: ${results.joinToString(", ")}")

    println("Задание 3")
        val concatenate: (String, String) -> String = { str1, str2 -> "$str1 $str2" }
        val result = concatenate("Привет", "мир")
        println (result)
}
