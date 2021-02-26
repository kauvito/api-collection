package me.kauan.collection

fun main() {
    val rob = Funcionario("Robb Som", 3000.50, "CLT")
    val kleb = Funcionario("Kleb Erson", 2000.50, "PJ")
    val mar = Funcionario("Mar Cia", 1000.0, "CLT")

    val funcionario1 = setOf(rob, mar)
    val funcionario2 = setOf(kleb)

    //unindo set(Conjuntos)
    val funcionariosUnion = funcionario1.union(funcionario2)
    funcionariosUnion.forEach { println(it) }

    //Subtrai o set
    val funcionario3 = setOf(rob, kleb, mar)
    val funcionarioSubstract = funcionario3.subtract(funcionario1)
    funcionarioSubstract.forEach { println(it) }

    //Retorna o que há de comum netre os dois conjuntos
    val funcionarioIntersect = funcionario3.intersect(funcionario1)
    funcionarioIntersect.forEach { println(it) }

}