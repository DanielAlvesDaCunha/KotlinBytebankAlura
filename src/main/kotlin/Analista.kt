class Analista(
     nome: String,
     cpf: String,
     salario: Double
    ) : Funcionario(nome = nome, cpf= cpf, salario = salario) {
  override val Bonificacao: Double
        get() {
            return salario * 0.1
        }

}