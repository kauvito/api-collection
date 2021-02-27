package me.kauan.collection

fun main() {
    val rob = Funcionario("Robb Som", 3000.50, "CLT")
    val kleb = Funcionario("Kleb Erson", 2000.50, "PJ")
    val mar = Funcionario("Mar Cia", 1000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(rob.nome, rob)
    repositorio.create(kleb.nome, kleb)
    repositorio.create(mar.nome, mar)

    println(repositorio.findById(mar.nome))

    println("Imprimir todos elementos do map")
    repositorio.findAll().forEach{ println(it) }

    //remover item do map
    repositorio.remove(mar.nome)

    println("Imprimir todos elementos do map")
    repositorio.findAll().forEach{ println(it) }
}