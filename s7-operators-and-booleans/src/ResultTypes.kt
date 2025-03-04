fun main() {
    val a: Short = 6
    val b: Int = 32
    val result = a * b
    println(result::class.java) // int

    val c: Long = 2864582635
    val d: Float = 13.67F
    val result2 = c / d
    println(result2::class.java) // float

    val e: Float = 234.45F
    val f = 34586.453
    val result3 = e * f
    println(result3::class.java) // double
}