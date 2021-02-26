package me.kauan.collection

fun main() {
    val pair: Pair<String, Double> = Pair("Kauan", 1.0)
    val map = mapOf(pair)

    map.forEach { (x, y) -> println("Chave $x - valor $y") }

    //Adição de chave e valor no mapa (sintaxe infix)
    val map1 = mapOf(
        "Pedro" to 12.0,
        "Robb" to 13.5
    )

    map1.forEach { (x, y) -> println("Chave $x - valor $y") }
}