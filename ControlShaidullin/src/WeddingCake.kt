

class WeddingCake(val newlyweds: String) : Cake() {

    override fun getInfo(): String {
        return "This cake for $newlyweds";
    }

    fun sale(sale: Double): Double {
        return price - (price * sale / 100);
    }
}