fun main() {
    println("Exercicio 1")
    for (i in 1..50) {
        println(i)
    }
    println("\n")
    println("Exercicio 2")
    for (i in 50 downTo 1) {
        println(i)
    }
    println("\n")
    println("Exercicio 3")
    for (i in 1..50 step 5) {
        println(i)
    }

    println("\n")
    println("Exercicio 3")
    for (i in 1..500) {
        println(i + i)
    }

    println("\n")
    println("Exercicio 4")
    println("Digite o numero de entrada")
    val entrada = readlnOrNull()
    if (entrada != null && entrada != "") {

        for (i in 1..entrada.toInt()) {
            for(j in 1..i){
                print("#")
            }
            println()
        }


    }
}