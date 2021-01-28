fun main() {

    // Buscar na base e retornar um novo aluno


    //sem scope
    val resultadoBase = obterAluno()
    var aluno = Aluno(
        resultadoBase["nome"] ?: "",
        resultadoBase["idade"]?.toInt() ?: 0
    )

    //com scope
    aluno = with(obterAluno()) {
        Aluno(
            get("nome") ?: "",
            this["idade"]?.toInt() ?: 0
        )
    }
}