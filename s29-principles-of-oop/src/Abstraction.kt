fun main() {
//    val container = Container() // I cannot do that bc it is abstract
    val container: Container = Bottle()
//    container.fill() // I cannot do that because I set type Container
    container.pour()
}

abstract class Container {
    abstract fun pour()
}

class Bottle : Container() {
    fun fill() {
        println("filling")
    }

    override fun pour() {
        println("pouring bottle")
    }
}

class Jig : Container() {
    override fun pour() {
        println("pouring jig")
    }
}