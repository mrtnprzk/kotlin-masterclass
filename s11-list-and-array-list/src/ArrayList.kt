fun main() {
    val colors = arrayListOf("Red", "Green", "Blue")
    println(colors)

    val noColors: ArrayList<String> = arrayListOf()
    println(noColors)
    noColors.add(colors[0])
    println(noColors)

    val moreColors = arrayListOf("Orange", "Silver", "Black")
    colors.addAll(moreColors)
    println(colors)
    colors.remove(colors[2])
    println(colors)
    colors.removeAll(moreColors)
    println(colors)
    colors.removeAt(0)
    println(colors)
}