package me.kauan.collection

fun main() {
    val salarios = DoubleArray(3)
        salarios[0] = 1000.00
        salarios[1] = 2000.00
        salarios[2] = 3000.00

    salarios.forEach { println(it) }

    println("Atribuir outro valor na posição ")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }

    println("Outra forma de criar o doubleArray ")
    val salario2 = doubleArrayOf(1000.50, 1520.0, 350.50)
    salario2.sort()
    salario2.forEach { println(it) }
}