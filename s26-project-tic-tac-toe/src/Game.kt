import kotlin.random.Random

val board = arrayListOf<ArrayList<String>>()

fun main() {
    for (i in 0..2) {
        val row = arrayListOf<String>()
        for (j in 0..2) {
            row.add("")
        }
        board.add(row)
    }
    printBoard()

    var continueGame = true

    do {
        println("Enter a position (e. g. 1, 1)")
        val input = readLine() ?: ""
        var x = 0
        var y = 0

        try {
            val positions = input.split(",")
            x = positions[0].trim().toInt()
            y = positions[1].trim().toInt()
            var skipRound = false

            if (board[x - 1][y - 1] != "") {
                println("Already taken")
                skipRound = true
            } else {
                board[x - 1][y - 1] = "X"
                printBoard()
            }

            if (!skipRound) {
                val playerWon = checkWinner(true)

                if (playerWon) {
                    println("You won!")
                    continueGame = false
                }

                val boardFull = checkBoardFull()
                if (!playerWon && boardFull) {
                    println("It's tie!")
                    continueGame = false
                }

                if (continueGame) {
                    placeComputerMove()
                    printBoard()
                    val computerWon = checkWinner(false)
                    if (computerWon) {
                        println("Computer won ...")
                        continueGame = false
                    }
                }
            }

        } catch (e: Exception) {
            println("Invalid input")
        }
    } while (continueGame)
}

fun printBoard() {
    println("-------------")
    for (ri in 0..2) {
        for (j in 0..2) {
            when (board[j][ri]) {
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}

fun checkWinner(player: Boolean): Boolean {
    var won = false
    val checkSymbol = if (player) "X" else "O"
    for (i in 0..2) {
        // Horizontal wins
        if (board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol) {
            won = true
        }

        // Vertical wins
        if (board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol) {
            won = true
        }
    }
    // Diagonal wins
    if (board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol) {
        won = true
    }
    if (board[2][0] == checkSymbol && board[1][1] == checkSymbol && board[0][2] == checkSymbol) {
        won = true
    }

    return won
}

fun checkBoardFull(): Boolean {
    var boardFull = true

    for (i in 0..2) {
        for (j in 0..2) {
            if (board[i][j] == "") {
                boardFull = false
                break
            }
        }
    }

    return boardFull
}

fun placeComputerMove() {
    var i = 0
    var j = 0
    do {
        i = Random.nextInt(3)
        j = Random.nextInt(3)
    } while (board[i][j] != "")
    board[i][j] = "0"
}