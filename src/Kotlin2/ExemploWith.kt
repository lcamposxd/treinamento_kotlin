fun main() {

    // Buscar na base e retornar um novo aluno, se não for null


    //sem scope
    val resultadoBase = obterAlunoOrNull()
    var aluno = if(resultadoBase != null) {
        Aluno(
            resultadoBase["nome"] ?: "",
            resultadoBase["idade"]?.toInt() ?: 0
        )
    } else null
    println(aluno)

    //com scope
    aluno = obterAlunoOrNull()?.run {
        Aluno(
            this["nome"] ?: "",
            this["idade"]?.toInt() ?: 0
        )
    }
    println(aluno)
}