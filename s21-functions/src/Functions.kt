fun main() {
    for (i in 1..3) {
        sayHello(i)
    }
    printAlphabet()
}

fun sayHello(n: Number) {
    println("Hello There! $n")
}

fun printAlphabet() {
    println("a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, s, t, ...")
}