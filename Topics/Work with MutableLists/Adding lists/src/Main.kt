fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    // Concatenating the two lists
    val combinedList = firstList + secondList

    // Printing the result with joinToString
    println(combinedList.joinToString(", "))
}