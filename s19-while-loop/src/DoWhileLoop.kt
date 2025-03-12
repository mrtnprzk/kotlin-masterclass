fun main() {
    val puzzlePieces = 20
    var piecesPlaced = 0

    do {
        piecesPlaced++
        println("Placed piece $piecesPlaced of $puzzlePieces")
    } while (piecesPlaced < puzzlePieces)
}