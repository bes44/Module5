package delegate

/**
 * 1. Написать программу перевода числа из десятичной системы в двоичную систему счисления.
 *
 * 2. Написать программу перевода числа из двоичной системы в десятичную систему счисления.
 *
 * 3. Написать программу, которая проверяет, является ли слово палиндромом.
 */

    private fun decimalToBinary(decimal: Int): String {
        return Integer.toBinaryString(decimal)
    }
    fun binaryToDecimal(binary: String): Int {
        return Integer.parseInt(binary, 2)
    }
    fun isPalindrome(word: String): Boolean {
        val cleanedWord = word.filter { it.isLetterOrDigit() }.toLowerCase()
        return cleanedWord == cleanedWord.reversed()
    }


    fun main() {
        println("Задание 1")
        var number = 42
        var binary = decimalToBinary(number)
        println("Число $number в двоичной системе: $binary")
        println("Задание 2")
        binary = "101010"
        number = binaryToDecimal(binary)
        println("Число $binary в десятичной системе: $number")
        println("Задание 3")
        val word = "Довод"
        val isPalindrome = isPalindrome(word)
        if (isPalindrome) {
            println("Слово \"$word\" является палиндромом.")
        } else {
            println("Слово \"$word\" не является палиндромом.")
        }
    }