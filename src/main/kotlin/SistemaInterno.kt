class SistemaInterno {

    fun entra(gerente:FuncionarioAdmin, senha: Int){
        if(gerente.autentic(senha)){
            println("Bem vindo ao Bytebank")
        }else{
            println("Falha na autenticacao")
        }
    }
}