class JibaritoSandwichBuilder {
    fun createSandwich(): Sandwich {
        val bread = prepareBread()
        val cheese = addCheese()
        val veggies = addVeggies()
        val mayo = isMayo()
        val toasted = isToasted()
        val mustard = hasMustard()

        return Sandwich(
            bread, cheese, mayo, toasted, mustard, veggies
        )
    }

    private fun prepareBread(): BREAD = BREAD.BROWN

    private fun addCheese(): CHEESE = CHEESE.CHEDDAR

    private fun addVeggies(): List<String> = listOf("tomato", "onion", "cucumber")

    private fun isMayo(): Boolean = true

    private fun isToasted(): Boolean = true

    private fun hasMustard(): Boolean = false
}
