package me.kauan.collection

fun main() {
    val rob = Funcionario("Robb Som", 3000.50, "CLT")
    val kleb = Funcionario("Kleb Erson", 2000.50, "PJ")
    val mar = Funcionario("Mar Cia", 1000.0, "CLT")

    val funcionarios = mutableListOf(rob, mar)

    funcionarios.forEach { println(it) }

    //adicionando item na lista
    funcionarios.add(kleb)
    funcionarios.forEach { println(it) }

    //removendo item da lista
    funcionarios.remove(rob)
    funcionarios.forEach { println(it) }

    //Conjunto, SET não se repete
    val funcionarioSet = mutableSetOf(rob)
    funcionarioSet.forEach { println(it) }

    funcionarioSet.add(kleb)
    funcionarioSet.add(mar)
    funcionarioSet.forEach { println(it) }

    funcionarioSet.remove(mar)
    funcionarioSet.forEach { println(it) }


}