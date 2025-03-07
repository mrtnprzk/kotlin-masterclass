fun main() {
    val hashMap = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(hashMap.size)
    println(hashMap.containsKey(1))
    println(hashMap.containsKey(4))
    println(hashMap.containsValue("one"))
    println(hashMap.containsValue("four"))
    println(hashMap.isEmpty())
    println(hashMap.isNotEmpty())
}