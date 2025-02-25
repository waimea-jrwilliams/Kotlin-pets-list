fun main() {
    val pets = mutableListOf<String>()

    // Some test data
    pets.add("Dog")
    pets.add("Cat")
    pets.add("Bird")

    while (true) {
        // Show the current pets
        show(pets)

        // Get user action
        val action = menu()

        // Act upon it
        when (action) {
           'Q' -> break
            'A' -> getNewPet(pets)
//            'D" -> deletePet()
        }
    }
}


/**
 * Get a new name from the user and
 * add to the given list of pets
 */
fun getNewPet(pets: MutableList<String>) {
    val newPet = getString("New Pet: ")
    pets.add(newPet)

}


/**
 * Show a menu and get the user's
 * choice. Return this as a char
 */
fun menu(): Char {
    println("[A]dd a new pet")
    println("[D]elete a pet")
    println("[Q]uit")

    val validChoices = "ADQ"

    while (true) {
        print("Choice: ")
        val input = readln()

        // Typed nothing? Try again
        if (input.isBlank()) continue

        // Grab the first letter
        val choice = input.lowercase().first()

        // Check if it is a valid option
        if (validChoices.contains(choice)) {return choice
        }
    }
}


/**
 * Show a given list with numbered
 * entries (From 1 upwards)
 */
fun getString(prompt: String): String {
    var userInput: String
    while (true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank())
            break

    }
    return userInput
    }