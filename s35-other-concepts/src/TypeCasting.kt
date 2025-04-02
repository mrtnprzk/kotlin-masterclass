fun main() {
    val value = "string"

    if (value is String) {
        println("Is string")
    } else {
        println("Is not string")
    }

    // ANOTHER CASE
    val myCar: Car = getCar()

    if (myCar !is BMW) {
        println("My car is not BMW")
    } else {
        println("My car is BMW")
    }

    //ANOTHER CASE
    val bmwCar = myCar as? BMW
    bmwCar?.drive()
}

open class Car() {}
class BMW : Car() {
    fun drive() {
        println("Driving BMW")
    }
}

fun getCar(): Car = BMW()
