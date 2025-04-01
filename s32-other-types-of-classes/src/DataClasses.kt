fun main() {
    val myUser = User("John", "john@gmail.com", "john123")
    println(myUser)  // if it would be `class User` instead of `data class User` that it is class id
    println(myUser.toString()) // if it would be `class User` instead of `data class User` that it is class id

    val myUser2 = User("John", "john@gmail.com", "john123")
    println(myUser == myUser2) // if it would be `class User` instead of `data class User` that it is false
}

data class User(
    val name: String,
    val email: String,
    val password: String,
)