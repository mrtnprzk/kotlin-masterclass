import kotlin.random.Random

fun main() {
    val number = Random.nextInt(100)
    println("The number is $number")

// takeIf
    val evenOrNull = number.takeIf { it % 2 == 0 }
    println("The even number is  $evenOrNull")

// takeUnless
    val oddOrNull = number.takeUnless { it % 2 == 0 }
    println("The odd number is  $oddOrNull")
}