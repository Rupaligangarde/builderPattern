class SandwichMaker(private val builder: SandwichBuilder) {

    fun make(): Sandwich {
        val bread = builder.prepareBread()
        val cheese = builder.addCheese()
        val veggies = builder.addVeggies()
        val mayo = builder.isMayo()
        val toasted = builder.isToasted()
        val mustard = builder.hasMustard()

        return Sandwich(
            bread, cheese, mayo, toasted, mustard, veggies
        )
    }
}