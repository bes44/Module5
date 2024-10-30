package nestedClassesInterfaces

/**
 * 1. Создать класс Human(человек). В нем создать несколько внутренних классов, например, head(голова), legs(ноги),
 * в каждом из классов напишите функции этой части тела. В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
 *
 * 2. Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов". Написать программу поиска и вывода на экран элементов массива по вводимым символам.
 *
 * 3. Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд. Посчитать количество элементов, которые находятся между нолями.
 */
class Human(val name: String) {

    inner class Head {
        fun think() {
            println("$name думает.")
        }

        fun eat() {
            println("$name кушает.")
        }
    }

    inner class Legs {
        fun walk() {
            println("$name ходит.")
        }

        fun run() {
            println("$name бежит.")
        }
    }
}
fun countElementsBetweenZeros(array: IntArray): Int {
    val firstZeroIndex = array.indexOfFirst { it == 0 }
    val secondZeroIndex = array.indexOfLast { it == 0 }

    return if (firstZeroIndex != -1 && secondZeroIndex != -1 && firstZeroIndex != secondZeroIndex) {
        secondZeroIndex - firstZeroIndex - 1
    } else {
        0
    }
}


fun main() {
    val human = Human("Иван")

    val head = human.Head()
    head.think()
    head.eat()

    val legs = human.Legs()
    legs.walk()
    legs.run()

    val names = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println("Введите символы для поиска:")
    val input = readLine() ?: ""
    val filteredNames = names.filter { it.contains(input, ignoreCase = true) }
    if (filteredNames.isNotEmpty()) {
        println("Найденные имена: ${filteredNames.joinToString(", ")}")
        } else {
        println("Совпадений не найдено")
        }

    val array = intArrayOf(1, 2, 0, 3, 4, 5, 0, 6, 7)
    val count = countElementsBetweenZeros(array)
    println("Количество элементов между нулями: $count")Сид

}
