import kotlin.contracts.contract

fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")
    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.Deposita(300.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta("Fran", 1001)
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

    if (contaFran.transfere(valor = 60.0, destino =  contaAlex)) {
        println("transferencia completa")
    } else {
        println("falha na transferencia")
    }
    println("Alex com essa transferencia esta com o saldo de:")
    println(contaAlex.saldo)
    println("Fran com essa transferencia esta com o saldo de:")
    println(contaFran.saldo)

}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set


    fun Deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor

        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.Deposita(valor)
            return true
        }
        return false
    }


}

//    fun contasExistentes() {
//        val contaAlex = Conta()
//        contaAlex.titular = "Alex"
//        contaAlex.numero = 1000
//        contaAlex.setSaldo(-300.0)
//        println(contaAlex.titular)
//        println(contaAlex.numero)
//        println(contaAlex.getSaldo())
//
//        val contaFran = Conta()
//        contaFran.titular = "Fran"
//        contaFran.numero = 1001
//        contaFran.setSaldo(-200.0)
//        println(contaFran.titular)
//        println(contaFran.numero)
//        println(contaFran.getSaldo())

//    println("Depositando na conta do Alex")
//    contaAlex.Deposita(0.0)
//    println(contaAlex.saldo)
//    println("Depositando na conta da Fran")
//    contaFran.Deposita(0.0)
//    println(contaFran.saldo)
//
//    println("com esse saque o alex tem em sua conta:")
//    contaAlex.saca(200.0)
//    println(contaAlex.saldo)
//    println("Com esse saque o fran tem em sua conta:")
//    contaFran.saca(250.0)
//    println(contaFran.saldo)
//
//    if(contaFran.transfere(60.0, contaAlex)){
//        println("transferencia completa")
//    }else{
//        println("falha na transferencia")
//    }
//    println("Alex com essa transferencia esta com o saldo de:")
//    println(contaAlex.saldo)
//    println("Fran com essa transferencia esta com o saldo de:")
//    println(contaFran.saldo)


fun testaCondicioes() {
    val contaJoao = Conta("Joao", 1002)
    contaJoao.titular = "joao"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

}

fun saldo() {
    val titular = "Daniel Alves"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100.00
    saldo += 100
    println("titular $titular")
    println("Numero da conta $numeroConta")
    println("saldo da conta $saldo")
}

