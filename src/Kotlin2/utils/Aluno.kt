data class Aluno(
    val nome: String,
    var idade: Int = 0,
    var faculdade: String = ""
)

data class Cliente(
    val id: Long,
    val nome: String,
    val genero: Char
)


fun salvarAluno(a: Any) = 1

fun obterAluno() = mapOf("nome" to "Teste da Silva", "idade" to "56")
fun obterAlunoOrNull(): Map<String, String>? = mapOf("nome" to "Teste da Silva", "idade" to "56")
fun obterFaculdadePorAlunoNome(nome: String) = "Faculdade de Testes"