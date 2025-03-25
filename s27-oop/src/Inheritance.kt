fun main() {
    val myDoggy = Corgi()

    myDoggy.size = 10
    println(myDoggy.size)
    myDoggy.bark()
    myDoggy.play()
}

open class Dog {
    var size = 0

    fun bark() {
        println("bark")
    }

    fun play() {
        println("play")
    }
}

class Corgi : Dog() {}