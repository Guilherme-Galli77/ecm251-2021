package br.maua.Controle;

import br.maua.Models.Membro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * Classe responsável pelo controle da lista
 */
public class ControleLista {
    private ArrayList<Membro> ListaDeMembros = new ArrayList<Membro>();

    /**
     * Getter da lista de membros
     * @return retorna a lista de membros
     */
    public ArrayList<Membro> getListaDeMembros() {
        return ListaDeMembros;
    }


    /**
     * Metodo responsavel pela adição de membros na lista
     * @param membro Novo objeto da classe membro a ser adicionado
     */
    public void AddMembro(Membro membro){
        this.ListaDeMembros.add(membro);
    }

    /**
     * Metodo responsavel pela remoção de membros na lista
     * @param membro Objeto da classe membro a ser removido
     */
    public void RemoverMembro(Membro membro){
        this.ListaDeMembros.remove(membro);

    }

    /**
     * Método responsável pela limpeza da lista
     * @throws IOException Retorna uma exceção do tipo IO
     */
    public static void Limpa()throws IOException {
        Writer out = new FileWriter("Dados.txt");

        //limpa
        out.write("");
        out.flush();

        //escreve
        out.flush();
        out.close();
    }

}
