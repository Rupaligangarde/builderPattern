fun main() {

    val clubSandwichMaker = SandwichMaker(ClubSandwichBuilder())
    val clubSandwich = clubSandwichMaker.make()
    print("Your Club sandwich contains ${clubSandwich.breadType} bread, ${clubSandwich.cheeseType} cheese and ${clubSandwich.vegetables} veggies, \n Thank you. Visit again \n")

    val jibaritoSandwichMaker = SandwichMaker(JibaritoSandwichBuilder())
    val jibaritoSandwich = jibaritoSandwichMaker.make()
    print("Your Jibarito sandwich contains ${jibaritoSandwich.breadType} bread, ${jibaritoSandwich.cheeseType} cheese and ${jibaritoSandwich.vegetables} veggies, \n Thank you. Visit again \n")
}