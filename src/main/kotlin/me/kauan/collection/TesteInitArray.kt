package me.kauan.collection

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //iteração normal
    for (valor in values){
        println(valor)
    }

    //interação com lambda
    values.forEach { valor ->
        println(valor)
    }

    //iteração ultilizando o indice do array
    for (index in values.indices){
        println(values[index])
    }

    //ordenando o array
    values.sort()
    for (valor in values){
        println(valor)
    }



}