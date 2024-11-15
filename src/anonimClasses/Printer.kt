package anonimClasses


/**
 * 1. Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 *
 * 2. Посчитать сумму элементов побочной диагонали матрицы 4х4.
 *
 * 3. Написать абстрактный класс Printer со своими свойствами и функциями. В функции main создать несколько объектов Printer.
 */
abstract class Printer(val brand: String, val model: String) {

    abstract fun printDocument(document: String)

    fun showInfo() {
        println("Принтер: $brand $model")
    }
}

class InkjetPrinter(brand: String, model: String) : Printer(brand, model) {
    override fun printDocument(document: String) {
        println("Печать документа '$document' на струйном принтере $brand $model")
    }
}

class LaserPrinter(brand: String, model: String) : Printer(brand, model) {
    override fun printDocument(document: String) {
        println("Печать документа '$document' на лазерном принтере $brand $model")
    }
}

fun main() {
    println("Задание 1")
    val words = arrayOf("Шумоизоляция", "Программирование", "Кот", "Симфония", "Инженер")
    val longestWord = words.maxByOrNull { it.length }
    val length = longestWord?.length ?: 0
    if (longestWord != null) {
        println("Самое длинное слово: $longestWord")
        println ("Количество букв в этом слове: $length")
    } else {
        println("Массив строк пуст.")
    }
    println("Задание 2")
    val matrix =
        arrayOf(intArrayOf(1, 2, 3, 4),
                intArrayOf(5, 6, 7, 8),
                intArrayOf(9, 10, 11, 12),
                intArrayOf(13, 14, 15, 16))
    var sum = 0
    for (i in matrix.indices) {
        sum += matrix[i][matrix.size - 1 - i]
    }
    println ("Сумма элементов побочной диагонали: $sum")
    println("Задание 3")
    val inkjetPrinter = InkjetPrinter("HP", "DeskJet 3700")
    val laserPrinter = LaserPrinter("Canon", "imageCLASS LBP6030w")

    inkjetPrinter.showInfo()
    inkjetPrinter.printDocument("Отчет за месяц")

    laserPrinter.showInfo()
    laserPrinter.printDocument("Проектная документация")
}
