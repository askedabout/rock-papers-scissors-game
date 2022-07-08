package rockpaperscissors.logic

abstract class Player {
    abstract val name: String
    abstract fun chooseValue(): String
    val possibleChoices = listOf("rock", "paper", "scissors")
}
