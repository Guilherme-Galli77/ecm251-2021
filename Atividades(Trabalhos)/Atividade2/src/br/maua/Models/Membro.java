package br.maua.Models;

import br.maua.Interfaces.IApresentacao;
import br.maua.Interfaces.IPostarMensagem;

import br.maua.Enums.TiposMembros;


public abstract class Membro implements IApresentacao, IPostarMensagem {

    /**
     * Atributos da Classe
     */
    private String nome;
    private String email;
    private TiposMembros funcao;

    /**
     * Construtor da classe membro
     * @param nome nome do membro
     * @param email email do membro
     * @param funcao funcao do membro
     */
    public Membro(String nome, String email, TiposMembros funcao) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
    }

    /**
     * Getter do nome
     * @return retorna o nome de um mebro
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome
     * @param nome nome atribuido a um membro
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


    /**
     * Getter do email
     * @return retorna o email de um membro
     */
    public String getEmail() {
        return email;
    }

    /**
     *Setter do email
     * @param email email atribuido a um membro
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Getter da funcao
     * @return retorna a função de um membro
     */
    public TiposMembros getFuncao() {
        return funcao;
    }

    /**
     * Setter da funcao
     * @param funcao funcao atribuida a um determinado membro
     */
    public void setFuncao(TiposMembros funcao) {
        this.funcao = funcao;
    }

    /**
     * ToString do membro
     * @return Estado atual do membro
     */
    @Override
    public String toString() {
        return "Membro{" + "nome='" + nome + '\'' + ", email='" + email + '\'' + ", funcao=" + funcao + '}';
    }
}
