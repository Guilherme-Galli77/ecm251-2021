package br.maua.Controle;

public class Dados {
    final public String funcao;
    final public String nome;
    final public String email;

    /**
     * Construtor do elemento Dados
     * @param funcao funcao a ser cadastrada
     * @param nome nome a ser cadastrado
     * @param email email a ser cadastrado
     */
    public Dados(String funcao, String nome, String email) {
        this.funcao = funcao;
        this.nome = nome;
        this.email = email;
    }

    /**
     * Método que representa o estado do objeto item
     * @return ToString
     */
    @Override
    public String toString() {
        return "Dados{" +
                "funcao='" + funcao + '\'' +
                "nome='" + nome + '\'' +
                ", email=" + email +
                '}';
    }

    /**
     * Método que cria um objeto Dados dada a uma string de entrada
     * @param dados String com os valores da funcao, do nome e do email
     * @return Uma instância de dados
     */
    public static Dados pegaDados(String dados){
        return new Dados(dados.split(";")[0], dados.split(";")[1], dados.split(";")[2]);
    }
}