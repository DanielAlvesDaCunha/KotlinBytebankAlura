fun TestaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificao ${alex.Bonificacao}")


    val Fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${Fran.nome}")
    println("cpf ${Fran.cpf}")
    println("salario ${Fran.salario}")
    println("bonificao ${Fran.Bonificacao}")

    if (Fran.autentic(1234)) {
        println("Auntenticou com sucesso")
    } else {
        println("autenticacao falha")
    }

    val gui = Diretor(
        nome = "gui",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 1333,
        plr = 200.0
    )
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificao ${gui.Bonificacao}")
    println("plr ${gui.plr}")

    if (gui.autentic(1333)) {
        println("Auntenticou com sucesso")
    } else {
        println("autenticacao falha")
    }

    val maria: Funcionario = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3500.0
    )
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(Fran)
    calculadora.registra(gui) 
    calculadora.registra(maria)

    println("total bonificao: ${calculadora.total}")
}