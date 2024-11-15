package functionsType

/**
 * 1. Написать программу, которая будет вычислять факториал числа с применением рекурсии.
 *
 * 2. Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
 *
 * 3. Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
 * Написать функцию, которая будет увеличивать элемент массива на единицу,
 * находящийся через одну позицию. Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
 */

fun factorial(n: Int): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

fun powerOfTen(n: Int): Long {
    return if (n == 0) {
        1
    } else {
        10 * powerOfTen(n - 1)
    }
}

fun incrementAlternateElements(array: Array<Int>): Array<Int> {
    for (i in array.indices step 2) {
        array[i] += 1
    }
    return array
}



fun main() {
    println("Задание 1")
    val number = 5
    var result = factorial(number)
    println("Факториал числа $number = $result")

    println("Задание 2")
    val exponent = 3
    result = powerOfTen(exponent)
    println("10 в степени $exponent = $result")

    println("Задание 3")
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Текущий массив:                    ${array.joinToString(", ")}")
    val newArray = incrementAlternateElements(array)
    println("Массив после увеличения элементов: ${newArray.joinToString(", ")}")
}
