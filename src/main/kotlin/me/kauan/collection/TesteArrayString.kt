package me.kauan.collection

fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Kauan"
    nomes[1] = "Moreira"
    nomes[2] = "Vitorino"

    for (nome in nomes){
        println(nome)
    }

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Vitorino", "Kauan", "Moreira")
    nomes2.sort()
    nomes2.forEach { println(it) }

}