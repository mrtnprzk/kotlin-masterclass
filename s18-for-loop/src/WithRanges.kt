fun main() {
    for (i in 1..3) {
        println("Strikes $i")
    }
    println("U out")

    for (i in 10 downTo 0) {
        println(i)
        when (i) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("GO!")
        }
    }

    for (i in 10 downTo 0 step 3) {
        println("With Step 3 => $i")
    }
}