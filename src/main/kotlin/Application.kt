fun main() {
    val clubSandwichBuilder = ClubSandwichBuilder()
    val jibaritosandwichBuilder = JibaritoSandwichBuilder()
    val clubSandwich = clubSandwichBuilder.createSandwich()
    val jibaritoSandwich = jibaritosandwichBuilder.createSandwich()

    print("Your Club sandwich contains ${clubSandwich.breadType} bread, ${clubSandwich.cheeseType} cheese and ${clubSandwich.vegetables} veggies, \n Thank you. Visit again \n")
    print("Your Jibarito sandwich contains ${jibaritoSandwich.breadType} bread, ${jibaritoSandwich.cheeseType} cheese and ${jibaritoSandwich.vegetables} veggies, \n Thank you. Visit again \n")
}