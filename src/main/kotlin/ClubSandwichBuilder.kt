class ClubSandwichBuilder : SandwichBuilder() {

    override fun prepareBread(): BREAD = BREAD.WHITE

    override fun addCheese(): CHEESE = CHEESE.CHEDDAR

    override fun addVeggies(): List<String> = listOf("tomato", "onion")

    override fun isMayo(): Boolean = true

    override fun isToasted(): Boolean = true

    override fun hasMustard(): Boolean = true
}