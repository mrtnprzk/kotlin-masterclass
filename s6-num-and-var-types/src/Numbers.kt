fun main() {
    val items = 3
    val price = 29.99
    val totalPrice = price * items
    println("Total price is: $totalPrice")

    val numOfPeople = 7500000000
    println(items::class.java) // int
    println(price::class.java) // double
    println(numOfPeople::class.java) // long

    val days: Short = 20000
    println(days::class.java) // short

    val meals: Int = 3
    println(meals::class.java) // int

    val life: Long = 42
    println(life::class.java) // long

    val newLife = 42L
    println(newLife::class.java) // long

    val money = 5.99
    println(money::class.java) // double

    val moreMoney = 6.99F
    println(moreMoney::class.java) // float
}