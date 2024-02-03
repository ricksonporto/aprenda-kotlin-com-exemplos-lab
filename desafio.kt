// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val email: String) {
    // Adicione propriedades e métodos relevantes para um usuário, como histórico de formações, etc.
}

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    // Crie alguns usuários
    val usuario1 = Usuario("João", "joao@email.com")
    val usuario2 = Usuario("Maria", "maria@email.com")

    // Crie alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 90, Nivel.INTERMEDIARIO)

    // Crie uma formação e matricule usuários nela
    val formacao = Formacao("Desenvolvimento Kotlin")
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Adicione conteúdos à formação
    formacao.conteudos.add(conteudo1)
    formacao.conteudos.add(conteudo2)

    // Imprima informações ou faça outras operações conforme necessário
    println("Formação: ${formacao.nome}")
    println("Inscritos: ${formacao.inscritos}")
    println("Conteúdos: ${formacao.conteudos}")
}