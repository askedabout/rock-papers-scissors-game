import rockpaperscissors.logic.ComputerPlayer
import rockpaperscissors.logic.Game
import rockpaperscissors.logic.HumanPlayer

fun main() {
    val player1 = HumanPlayer("Ola")
    val player2 = ComputerPlayer()
    val game = Game(player1, player2)
    var isFinished = false

    while(!isFinished) {
        game.start()
        println("\nType 'y' to continue or press 'Enter' to exit.")

        val rl = readLine()
        if(rl.orEmpty() != "y")
            isFinished = true
    }
}