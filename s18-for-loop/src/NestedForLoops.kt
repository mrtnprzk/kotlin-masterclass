fun main() {
    val matrixSize = 9

    for (i in 1..matrixSize) {
        for (j in 1..matrixSize) {
            if (i == j) {
                print(" \uD83D\uDE00  \t")
            } else {
                print("$i $j \t")
            }
        }
        println()
    }
}