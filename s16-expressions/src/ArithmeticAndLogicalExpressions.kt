fun main() {
    if (326 / 72 * 15 + 93 % 13 == 62) {
        println("Math is EASY")
    } else {
        println("Math is HARD")
    }

    println("------------------------------")

    val haveCat = true
    val haveCatFood = false

    if (haveCat && haveCatFood) {
        println("Cat is HAPPY!")
    } else {
        println("Cat is hungry!")
    }

    println("------------------------------")

    val age = 29

    if (age >= 18) {
        println("U can drink alcohol")
    } else {
        println("U CANNOT drink alcohol")
    }

    println("------------------------------")

    val favoritePet = "dog"
    val availablePets = listOf("fish", "cat", "rabbit")

    if (favoritePet in availablePets) {
        println("Your pet is available!")
    } else {
        println("Your pet is NOT available :(")
    }

    println("------------------------------")

    val number = 9

    if (number !in 0..9) {
        println("Number is out of range.")
    } else {
        println("Number is NOT out of range.")
    }
}