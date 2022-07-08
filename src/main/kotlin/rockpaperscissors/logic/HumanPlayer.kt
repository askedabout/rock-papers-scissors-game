package rockpaperscissors.logic

class HumanPlayer(override val name: String) : Player() {

    override fun chooseValue(): String {
        var choice: String? = null
        while (choice == null || !possibleChoices.contains(choice)) {
            print("\nPlease choose \"Rock\", \"Paper\" or \"Scissors\": ")
            choice = readLine()?.lowercase()
        }
        return choice
    }
}