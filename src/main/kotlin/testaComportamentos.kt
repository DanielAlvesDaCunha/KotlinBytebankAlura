fun testaComportamentos() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.Deposita(300.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.Deposita(200.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println("Depositando na conta do Alex")
    contaAlex.Deposita(0.0)
    println(contaAlex.saldo)
    println("Depositando na conta da Fran")
    contaFran.Deposita(0.0)
    println(contaFran.saldo)

    println("com esse saque o alex tem em sua conta:")
    contaAlex.saca(200.0)
    println(contaAlex.saldo)
    println("Com esse saque o fran tem em sua conta:")
    contaFran.saca(250.0)
    println(contaFran.saldo)

//    if (contaFran.transfere(valor = 60.0, destino = contaAlex)) {
//        println("transferencia completa")
//    } else {
//        println("falha na transferencia")
//    }
    println("Alex com essa transferencia esta com o saldo de:")
    println(contaAlex.saldo)
    println("Fran com essa transferencia esta com o saldo de:")
    println(contaFran.saldo)
}