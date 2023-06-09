fun testaCondicoes() {
    val contaJoao = ContaCorrente("Joao", 1002)
    contaJoao.titular = "joao"
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)
}
