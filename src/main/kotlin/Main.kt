fun main() {
    println("Программа определяющяя - симметричен ли массив 5х5 относительно главной диагонали")
    val userArray: Array<Array<Int>> = Array(5) { Array(5) {0} }
    for (row in 0 until 5) {
        for (column in 0 until 5) {

            showField(userArray)
            userArray[row][column] = intValidate("Введите число для ячейки [$row][$column]: ")
        }
    }
    print(symmetricalDiagonally(userArray))
}

fun intValidate(message: String): Int {
    print(message)
    val userInput: Int
    try {
        userInput = readln().toInt()
    }
    catch (e: Exception){
        println("Ошибка ввода!\nВведите корректные данные")
        return intValidate(message)
    }
    return userInput
}

fun symmetricalDiagonally(mas: Array<Array<Int>>): String {
    for (row in 0 until 5) {
        for (column in 0 until 5) {
            if (mas[row][column] != mas[column][row]) {
                return "Не является симметричным относительно главной диагонали\n"
            }
        }
    }
    return "Является симметричным относительно главной диагонали\n"
}

fun showField(mas: Array<Array<Int>>) {
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n")
    for (row in 0 until 5) {
        for (column in 0 until 5) {
            print("${mas[row][column]} ")
        }
        println()
    }
}