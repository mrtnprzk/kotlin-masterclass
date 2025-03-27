fun main() {
    val yourCar = Car()
    val herCar = Car("Fiat")
    val myCar = Car("Tesla", 220)
}

class Car {
    constructor() {
        model = "No model"
        topSpeed = 150
    }

    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }

    constructor(newModel: String, newTopSpeed: Int) {
        model = newModel
        topSpeed = newTopSpeed
    }

    var model: String? = null
    var topSpeed = 100
}