class testaCondicioes {
    class Conta(
        var titular: String,
        val numero: Int
    ) {
        var saldo = 0.0
            private set
    }
}

    val contaJoao = Conta("Joao", 1002)
    contaJoao.titular = "joao"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
}