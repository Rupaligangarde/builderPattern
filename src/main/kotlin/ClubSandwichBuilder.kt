class ClubSandwichBuilder {
    fun createSandwich(): Sandwich {
        return Sandwich(
            "white",
            "chedder",
            true,
            true,
            false,
            listOf("tomato", "onion")
        )
    }
}