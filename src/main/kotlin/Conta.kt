abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set



    fun Deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}

//    fun transfere(valor: Double,
//                  destino: Conta
//    ): Boolean {
//        if (saldo >= valor) {
//            saldo -= valor
//            destino.Deposita(valor)
//            return true
//        }
//        return false
//    }




