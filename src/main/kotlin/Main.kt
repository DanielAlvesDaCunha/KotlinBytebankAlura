fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificao ${alex.bonificacao()}")


    val Fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${Fran.nome}")
    println("cpf ${Fran.cpf}")
    println("salario ${Fran.salario}")
    println("bonificao ${Fran.bonificacao()}")

    if (Fran.autentica(1234)) {
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
        println("bonificao ${gui.bonificacao()}")
        println("plr ${gui.plr}")

        if (Fran.autentica(1333)) {
            println("Auntenticou com sucesso")
        } else {
            println("autenticacao falha")

        }
    }
