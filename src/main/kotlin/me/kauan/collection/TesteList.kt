package me.kauan.collection

fun main() {
    val rob = Funcionario("Robb Som", 3000.50 , "CLT")
    val kleb = Funcionario("Kleb Erson", 2000.50 , "PJ")
    val mar = Funcionario("Mar Cia", 1000.0 , "CLT")

    val funcionarios = listOf(rob, kleb, mar)

    funcionarios.forEach{println(it)}

    println("Busca pelo nome")
    println(funcionarios.find { it.nome == "Robb Som" })

    println("Ordenando por salario e imprimindo o resultado")
    funcionarios
        .sortedBy { it.salario }
        .forEach {print(it)}

    println("Agrupando por tipo de contrato e imprimindo o resultado")
    funcionarios
        .groupBy { it.tipo }
        .forEach {print(it)}



}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String
) {
    override fun toString(): String =
   """
        nome: $nome
        salário: $salario
        
    """.trimIndent()


}