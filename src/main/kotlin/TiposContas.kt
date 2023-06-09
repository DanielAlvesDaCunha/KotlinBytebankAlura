public fun tiposContas() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    println("titular ${contaCorrente.titular}")
    println("Numero ${contaCorrente.numero}")
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    println("titular ${contaPoupanca.titular}")
    println("Numero ${contaPoupanca.numero}")

    contaCorrente.Deposita(1000.0)
    contaPoupanca.Deposita(1000.0)
    println("Saldo da Conta Corrente ${contaCorrente.saldo}")
    println("Saldo da Conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("Saldo da Conta Corrente ${contaCorrente.saldo}")
    println("Saldo da Conta poupanca ${contaPoupanca.saldo}")

//    contaPoupanca.transfere(100.0, contaCorrente)
//    println("saldo corrente apos transferir para poupanca: ${contaCorrente.saldo}")
//    println("saldo poupanca apos receber transferencia: ${contaPoupanca.saldo}")
}