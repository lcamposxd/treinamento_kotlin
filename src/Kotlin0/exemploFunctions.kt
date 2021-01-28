import java.lang.StringBuilder

fun StringBuilder.meuLog(): StringBuilder {
    println("Conteudo: $this")
    return this
}


inline fun logar(block: () -> Any) {
    println("RETORNO DA CHAMADA: ${block()}")

}

inline fun <T> logarComParametro(param: T, block: (T) -> Any) {
    println("PARAM: $param | RETORNO DA CHAMADA: ${block(param)}")

}



fun main() {
    val sb = StringBuilder()

    sb.append("UM ").append("DOIS ").meuLog().append("TRES ").append("QUATRO ").meuLog()
    /*
        Conteudo: UM DOIS
        Conteudo: UM DOIS TRES QUATRO
     */


    println("---------")
    logar({ 1+2 }) //RETORNO DA CHAMADA: 3
    logar { 1+2 }  //RETORNO DA CHAMADA: 3


    logarComParametro(10, {it * 2}) //PARAM: 10 | RETORNO DA CHAMADA: 20
    logarComParametro(10) {it * 2}  //PARAM: 10 | RETORNO DA CHAMADA: 20


}
