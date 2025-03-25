fun main() {
    if (DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }
    println("Database is connected ${DatabaseAccess.connected}")
}

object DatabaseAccess {
    var connected = false
    fun connect() {
        connected = true
        println("Connected!")
    }

    fun disconnect() {
        connected = false
        println("Disconnected!")
    }
}