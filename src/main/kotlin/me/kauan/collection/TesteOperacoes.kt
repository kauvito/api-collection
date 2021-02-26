package me.kauan.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.10, 4000.0)
    salarios.forEach { println(it) }

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menos salario: ${salarios.minOrNull()}")
    println("Média salario: ${salarios.average()}")

    println("Filtro maior que")
    val salarioMaiorQue2500 = salarios.filter { it > 2200.0}
    salarioMaiorQue2500.forEach {println(it)}

    println("Contagem com uso de range, é o uso do ponto ponto")
    println(salarios.count {it in 2000.0..3000.0})

    println("Busca por valor, se não houver retorna false")
    println(salarios.find {it == 2250.10})

    println("Busca por valor em qlqr elemento que exista esse valor, retorna boolean")
    println(salarios.any {it == 2250.10})


}