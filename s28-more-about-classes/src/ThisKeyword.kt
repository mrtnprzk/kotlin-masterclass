fun main() {
    val note = PostItNote()
    println(note.message)
    note.updateMessage("Meeting at 5")
    println(note.message)
}

class PostItNote() {
    var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        // println(message) same as this.message
        println(this.message)
    }
}