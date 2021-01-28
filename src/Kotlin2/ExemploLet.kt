fun main() {
    val alunoNome: String? = "Teste da Silva"
    // Salvar novo aluno e retornar ID

    //Sem scope
    var novoId = if(alunoNome != null) {
        val aluno = Aluno(alunoNome)
        salvarAluno(aluno)
    } else {
        null
    }
    println(novoId)

    //Com scope
    novoId = alunoNome?.let { Aluno(it) }?.let { salvarAluno(it) }
    println(novoId)

}