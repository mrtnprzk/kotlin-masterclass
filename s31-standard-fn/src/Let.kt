fun main() {
    val animals = listOf("cat", "dog", "bear", "mouse", "zebra")

    val filtered = animals.map { it.length }
        .filter { it > 3 }


    // first case
    filtered.let { filteredList ->
        println(filteredList)
        println("Size of list is ${filteredList.size}")
    }

    // second case
    filtered.let(::println)

    val name = readLine()
    name?.let {
        println("Your name is $name")
    }
}