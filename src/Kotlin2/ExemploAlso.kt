fun main() {
    var aluno: Aluno = Aluno(nome = "Teste da Silva")
    // Mudar a idade do aluno

    //Sem scope
    aluno = Aluno(nome = "Teste da Silva")
    aluno.faculdade = obterFaculdadePorAlunoNome(aluno.nome)

    println(aluno)

    //Com scope
    aluno = Aluno(nome = "Teste da Silva").apply { faculdade = obterFaculdadePorAlunoNome(nome) }

    println(aluno)


}