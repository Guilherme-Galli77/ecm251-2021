/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main(args : Array<String>) {
    //Declara uma variável
    // var nome = "Guilherme"
    // var sobrenome: String
    //   sobrenome = "Galli"
    //
    //
    //   SOLUÇÃO 1
    // Declara constantes
    val nome:String?
    val sobrenome:String?

    //println("Olá $nome $sobrenome")

    println("Informe seu nome: ")
    nome = readLine()
    println("Informe seu sobrenome: ")
    sobrenome = readLine()
    println("Bem vindo $nome $sobrenome")


    //   SOLUÇÃO 2
    // Declara constantes
    val nome:String
    val sobrenome:String

    //println("Olá $nome $sobrenome")

    println("Informe seu nome: ")
    nome = readLine()!!
    println("Informe seu sobrenome: ")
    sobrenome = readLine()!!
    println("Bem vindo $nome $sobrenome")

    //   SOLUÇÃO 3
    // Declara constantes
    val nome:String
    val sobrenome:String

    //println("Olá $nome $sobrenome")

    println("Informe seu nome: ")
    nome = readLine() ?: "Nome padrao"
    println("Informe seu sobrenome: ")
    sobrenome = readLine() ?: "Sobrenome padrao"
    println("Bem vindo $nome  $sobrenome")
}