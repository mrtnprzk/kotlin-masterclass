fun main() {
    var i = 0
    var j = 0

    while (i <= 9) {
        while (j <= 9) {
            print("$i, $j\t")
            j++
        }
        i++
        j = 0
        println()
    }
}