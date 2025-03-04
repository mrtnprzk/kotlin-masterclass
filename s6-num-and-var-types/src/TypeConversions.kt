fun main() {
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java) // int
    println(longCats::class.java) // long

    val people = 7500000000
    val fewPeople = people.toInt()
    println(people::class.java) // long
    println(fewPeople::class.java) // int
    println(fewPeople) // -1089934592 <== be careful

    val dogs = 5
    val byteDogs = dogs.toByte()
    val floatDogs = dogs.toFloat()
    println(dogs::class.java) // int
    println(byteDogs::class.java) // byte
    println(floatDogs::class.java) // float

    val pi = 3.1415926535
    val piString = pi.toString()
    println(pi::class.java) // double
    println(piString::class.java) // string
}