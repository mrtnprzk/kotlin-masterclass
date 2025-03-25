fun main() {
    val table = Table()
    println(table.color)

    val myGarage = Garage()
    myGarage.car.drive()
}

class Table {
    var color: String = "white"
}

class MyCar {
    fun drive() {
        println("Driving my car")
    }
}

class Garage {
    val car = MyCar()
}