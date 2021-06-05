package br.maua.models;
import java.util.Objects;

/**
 * Classe que representa a instância de um Item
 */
public class Item {
    public final String nome;
    public final int id;

    /**
     * Construtor que inicializa os atributos
     * @param nome
     * @param id
     */
    public Item(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Retorna o estado do objeto
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(nome, item.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }
}