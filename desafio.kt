// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun showInscritos(): MutableList<Usuario> {
        return inscritos
    }
}

fun main() {
    val usuario = Usuario("Allan")
    val usuario2 = Usuario("Jose")
    val conteudos: List<ConteudoEducacional> = listOf(ConteudoEducacional("Linguagem Kotlin"), ConteudoEducacional("Linguagem C", 30))
    val formacao = Formacao("Programacao", Nivel.BASICO, conteudos)

    formacao.matricular(usuario)
    formacao.matricular(usuario2)

    println("Usuarios: ${usuario.nome}, ${usuario2.nome}")
    println()
    println("Conteudos: $conteudos")
    println()
    println("Formacao: ${formacao.toString()}")
    println()
    println("Inscritos da formacao: ${formacao.showInscritos()}")
}
