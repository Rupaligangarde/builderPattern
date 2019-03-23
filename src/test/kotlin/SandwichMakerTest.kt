import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SandwichMakerTest {

    @Test
    fun `should make club sandwich`() {
        val sandwichMaker = SandwichMaker(ClubSandwichBuilder())
        val sandwich = sandwichMaker.make()
        Assertions.assertEquals(CHEESE.CHEDDAR, sandwich.cheeseType)
        Assertions.assertEquals(BREAD.WHITE, sandwich.breadType)
        Assertions.assertEquals(listOf("tomato", "onion"), sandwich.vegetables)
        Assertions.assertEquals(true, sandwich.hasMeyo)
        Assertions.assertEquals(true, sandwich.isToasted)
        Assertions.assertEquals(true, sandwich.hasMustard)
    }

    @Test
    fun `should make jibarito sandwich`() {
        val sandwichMaker = SandwichMaker(JibaritoSandwichBuilder())
        val sandwich = sandwichMaker.make()
        Assertions.assertEquals(CHEESE.CHEDDAR, sandwich.cheeseType)
        Assertions.assertEquals(BREAD.BROWN, sandwich.breadType)
        Assertions.assertEquals(listOf("tomato", "onion", "cucumber"), sandwich.vegetables)
        Assertions.assertEquals(true, sandwich.hasMeyo)
        Assertions.assertEquals(true, sandwich.isToasted)
        Assertions.assertEquals(false, sandwich.hasMustard)
    }
}