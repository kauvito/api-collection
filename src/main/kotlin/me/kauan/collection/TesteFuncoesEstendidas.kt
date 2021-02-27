package me.kauan.collection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "3500".toBigDecimal()
    )

    //criou uma função estendida no array
    println(salarios.somatoria())

    println(salarios.media())
}