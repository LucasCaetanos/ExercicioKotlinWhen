fun main(args: Array<String>) {
    println("Digite um numero para saber qual o mês correspondente: ")
    print("Digite um valor entre 1 e 12:")

    var num = readLine()!!.toInt()

    when(num) {
        1 -> println("Estamos em janeiro")
        2 -> println("Estamos em fevereiro")
        3 -> println("Estamos em março")
        4 -> println("Estamos em abril")
        5 -> println("Estamos em maio")
        6 -> println("Estamos em junho")
        7 -> println("Estamos em julho")
        8 -> println("Estamos em agosto")
        9 -> println("Estamos em setembro")
        10 -> println("Estamos em outubro")
        11 -> println("Estamos em novembro")
        12 -> println("Estamos em dezembro")
        else -> println("Valor inválido")
    }
}