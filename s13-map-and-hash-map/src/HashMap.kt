fun main() {
    val hashMap = hashMapOf(Pair(1, "a"), Pair(2, "b"), Pair(3, "c"))
    hashMap.put(4, "d")
    hashMap[5] = "e"
    println(hashMap)

    val hashMap2 = hashMapOf(Pair(6, "f"), Pair(7, "g"))
    hashMap.putAll(hashMap2)
    println(hashMap)

    hashMap.remove(5)
    println(hashMap)

    hashMap.put(1, "aa")
    println(hashMap)

    hashMap.replace(1, "aaa")
    println(hashMap)

    hashMap.clear()
    println(hashMap)
}