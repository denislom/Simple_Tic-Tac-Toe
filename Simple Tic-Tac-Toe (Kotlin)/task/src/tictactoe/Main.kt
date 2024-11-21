package tictactoe

fun main() {
    // write your code here
    val input: String = readln()
    var i = 0
    println("---------")
//    print("|")
    while (i < input.length) {
//        print(i)
        if (i == 0)
            print("| ${input[i++]}")
        else if (i % 3 == 0)
            print(" |\n| ${input[i++]}")
        else (i % 3 != 0)
            print(" ${input[i++]}")
    }
    println(" |")
    println("---------")
}