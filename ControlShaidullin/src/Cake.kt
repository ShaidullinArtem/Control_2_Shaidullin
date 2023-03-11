

abstract class Cake() : ICake {
    abstract val title: String
    abstract val dough: String
    abstract val cream: String
    abstract val weight: Double
    abstract val calories: Double
    abstract val price: Double

    override fun getInfo(): String {
        return "$title";
    }
}