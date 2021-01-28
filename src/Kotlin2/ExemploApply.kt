fun main() {
    var listAlunos =  mutableListOf(Aluno("aluno 1"), Aluno("aluno 2"))
    // Adicionar um aluno, mas logar o valor antes de adicionar


    //Sem scope
    listAlunos =  mutableListOf(Aluno("aluno 1"), Aluno("aluno 2"))
    println("Lista antiga: $listAlunos")
    listAlunos.add(Aluno("Novo Aluno"))
    println(listAlunos)

    //Com scope
    listAlunos =  mutableListOf(Aluno("aluno 1"), Aluno("aluno 2"))
    listAlunos.also { println("Lista antiga: $it") }.add(Aluno("Novo Aluno 2"))
    println(listAlunos)

}