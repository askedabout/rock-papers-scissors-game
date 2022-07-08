package rockpaperscissors.logic

class Game(val p1: Player, val p2: Player) {

    private var p1Choice: String? = null
    private var p2Choice: String? = null

    fun start() {
        p1Choice = p1.chooseValue()
        p2Choice = p2.chooseValue()


        val winner = getWinner(p1Choice!!, p2Choice!!)

        printFinalResult(winner)
    }

    private fun getWinner(p1Choice: String, p2Choice: String): Player? {
        return if (p1Choice == p2Choice) null
        else if (((p1Choice == "paper") && (p2Choice == "rock")) || ((p1Choice == "rock") && (p2Choice == "scissors")) || ((p1Choice == "scissors") && (p2Choice == "paper"))) p1
        else p2
    }

    private fun printFinalResult(winner: Player?) {
        println()
        println("${p1.name} chose $p1Choice")
        println("${p2.name} chose $p2Choice")
        if (winner == null)
            println("It's a draw!")
        else
            println("${winner.name} wins!")
    }
}