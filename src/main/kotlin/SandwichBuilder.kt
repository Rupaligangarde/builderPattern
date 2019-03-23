abstract class SandwichBuilder {

    abstract fun prepareBread(): BREAD

    abstract fun addCheese(): CHEESE

    abstract fun addVeggies(): List<String>

    abstract fun isMayo(): Boolean

    abstract fun isToasted(): Boolean

    abstract fun hasMustard(): Boolean
}