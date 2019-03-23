import BREAD.BREAD
import CHEESE.CHEESE

data class Sandwich(
    val breadType: BREAD,
    val cheeseType: CHEESE,
    val hasMeyo: Boolean,
    val isToasted: Boolean,
    val hasMustard: Boolean,
    val vegetables: List<String>
)
