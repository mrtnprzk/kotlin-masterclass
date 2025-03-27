fun main() {
    println(Ship.provideDrivingInstructions())
}

class Ship {
    companion object {
        fun provideDrivingInstructions() : String {
            return "Drive safe"
        }
    }
}