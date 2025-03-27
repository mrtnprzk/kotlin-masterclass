fun main() {
    val mom = MyMom()
    val daughter = MyDaughter()

    mom.say("hi")
    mom.say()
    mom.say(4)
    daughter.say("hi")
}

open class MyMom {
    open fun say(message: String) {
        println("Mom saying $message")
    }

    fun say() {
        println("Mom saying hello!")
    }

    fun say(times: Int) {
        for (i in 1..times) {
            println("Mom saying hi for $i time")

        }
    }
}

class MyDaughter : MyMom() {
    override fun say(message: String) {
        println("Daughter saying $message")
    }
}