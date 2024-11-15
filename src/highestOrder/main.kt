package highestOrder

/**
 * 1. Написать функцию высшего порядка action, которая на вход принимает значения двух цветов типа String.
 * Они будут смешиваться в функции, которая на вход поступает в качестве третьего аргумента в action,
 * она же возвращает строку – получившейся цвет. Функция action возвращает результат в виде строки смешанный цвет из двух заданных.
 *
 * 2. Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два.
 * Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым параметром функцию,
 * принимающую число и возвращающая число. Функция высшего порядка будет возвращать измененный массив,
 * который будет получаться за счет вызова внутри нее у этого массива функции map,
 * внутри которой будет вызываться функция изменения числа.
 */

fun action(color1: String, color2: String, mixColors: (String, String) -> String): String {
    print ("Смешение $color1 и $color2 дают")
    if (color1=="Красный") {
        if (color2=="Желтый") return "Оранжевый"
        if (color2=="Синий") return "Фиолетовый"
    }
    return mixColors(color1,color2)
}

fun incrementByOne(num: Int): Int {
    return num + 1
}

fun multiplyByTwo(num: Int): Int {
    return num * 2
}

fun processArray(numbers: Array<Int>, operation: (Int) -> Int): Array<Int> {
    return numbers.map(operation).toTypedArray()
}


fun main() {
    println("Задание 1")
    var result = action("Красный", "Желтый") { c1, c2 -> "$c1 и $c2" }
    print(" $result \n")
    result = action("Красный", "Синий") { c1, c2 -> "$c1 и $c2" }
    print(" $result \n")
    result = action("Красный", "Зеленый") { c1, c2 -> "$c1 и $c2" }
    print(" $result \n")

    println("Задание 2")
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val incrementedArray = processArray(numbers, ::incrementByOne)
    println("Массив после увеличения на единицу: ${incrementedArray.joinToString(", ")}")
    val multipliedArray = processArray(numbers, ::multiplyByTwo)
    println("Массив после умножения на два: ${multipliedArray.joinToString(", ")}")

}
