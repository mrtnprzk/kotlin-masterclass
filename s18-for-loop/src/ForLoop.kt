fun main() {

    val animals = arrayListOf("cat", "dog", "hamster")

    for (animal in animals) {
        println("Feed the $animal")
    }

    for (i in 1..12) {
        val month = when(i) {
            1 -> "Jan"
            2 -> "Feb"
            3 -> "Mar"
            4 -> "Apr"
            5 -> "May"
            6 -> "Jun"
            7 -> "Jul"
            8 -> "Aug"
            9 -> "Sep"
            10 -> "Oct"
            11 -> "Nov"
            12 -> "Dec"
            else -> "???"
        }
        println("Month #$i is called $month")
    }
}