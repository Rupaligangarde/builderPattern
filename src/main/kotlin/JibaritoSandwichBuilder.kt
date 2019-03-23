class JibaritoSandwichBuilder: SandwichBuilder() {

    override fun prepareBread(): BREAD = BREAD.BROWN

    override fun addCheese(): CHEESE = CHEESE.CHEDDAR

    override fun addVeggies(): List<String> = listOf("tomato", "onion", "cucumber")

    override fun isMayo(): Boolean = true

    override fun isToasted(): Boolean = true

    override fun hasMustard(): Boolean = false
}
