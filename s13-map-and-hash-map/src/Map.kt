fun main() {
    val map = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(map)
    println(map.get(1))
    println(map[3])
    println(map.keys)
    println(map.values)

    val emptyMap = emptyMap<Int, String>()
    println(emptyMap)
}