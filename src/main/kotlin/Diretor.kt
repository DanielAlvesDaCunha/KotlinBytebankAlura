class Diretor(
     nome: String,
     cpf: String,
     salario: Double,
     senha: Int,
    val plr: Double
    ) : FuncionarioAdmin(nome = nome, cpf= cpf, salario = salario,senha = senha) {
     override val Bonificacao: Double
        get() {
            return  + salario + plr
        }

}