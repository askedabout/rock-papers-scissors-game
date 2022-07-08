package rockpaperscissors.logic

class ComputerPlayer: Player() {
    override val name: String = "Computer"

    override fun chooseValue(): String {
        return possibleChoices.random()
    }
}