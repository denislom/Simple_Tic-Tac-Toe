fun main() {
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    // do not touch the lines above
    // write your code here   
    // Add the returnedWatchman to the list
    backToTheWall.add(returnedWatchman)

    // Print the updated list using joinToString()
    println(backToTheWall.joinToString(", "))
}