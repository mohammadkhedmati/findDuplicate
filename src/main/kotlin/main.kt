// =================== ABOUT ================
//Find Duplicate item in a list
//date : Tuesday, March 16, 2021
//created by : mohammad khedmati
//Every day learn something new :))

fun main() {
    val list = listOf(4, 6, 8, 3, 4, 4, 4, 4, 4, 4, 8, 8, 8, 8, 0)
    println(list.distinct()) // print all elemnts without Duplicate
    println(list.groupBy { it }.mapValues { it.value.count() }) // Print Value of Elements
}
