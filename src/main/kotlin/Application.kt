fun main() {
    val sandwichBuilder = ClubSandwichBuilder()
    val sandwich = sandwichBuilder.createSandwich()
    print("Your sandwich contains ${sandwich.breadType} bread, ${sandwich.cheeseType} cheese and ${sandwich.vegetables} veggies, \n Thank you. Visit again \n")
}