import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun printInfo(n: Int, cake: Cake) {
    for(i in 1..n) {
        delay(1000L)
        cake.getInfo();
    }
}


suspend fun main(args: Array<String>) =  coroutineScope{
    println("Enter n count: ");
    val n: Int = readln().toInt();
    val wCake: WeddingCake = WeddingCake()
    println(wCake.sale(10.0));

    val cake: Cake = Cake()
    launch { printInfo(n, cake) }
    println("info: ");
}