

class WeddingCake(val newlyweds: String) : Cake() {

    override val title = "None"
    override val dough = "None"
    override val cream = "None"
    override val weight = 0.0
    override val calories = 0.0
    override val price = 0.0

    override fun getInfo(): String {
        return "This cake for $newlyweds";
    }

    fun sale(sale: Double): Double {
        return price - (price * sale / 100);
    }
}