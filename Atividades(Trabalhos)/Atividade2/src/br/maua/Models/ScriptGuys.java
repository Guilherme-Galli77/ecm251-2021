package br.maua.Models;

import br.maua.Enums.Horarios;
import br.maua.Enums.TiposMembros;

public class ScriptGuys extends Membro{


    /**
     * Metodo/Classe que representa a função ScriptGuys
     * @param nome nome do integrante
     * @param email email do integrante
     * @param funcao funcao do integrante
     */
    public ScriptGuys(String nome, String email, TiposMembros funcao){
        super(nome, email, funcao);

    }


    /**
     * Organiza em uma "Tabela"
     */
    @Override
    public void ExibirRelatorio() {
        System.out.println(
            "nome: "    +getNome()+"\n"+
            "email: "   +getEmail()+"\n"+
            "Função: "  +getFuncao()+ "\n"
    );

    }


    /**
     * Metodo que retorna uma determinada mensagem conforme o horário selecionado
     * @param horario horario do expediente, pode ser normal ou extra
     */
    @Override
    public void Mensagem(Horarios horario){
        switch (horario) {

            //Em Horario Regular
            case REGULAR:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Prazer em ajudar novos amigos de código!\n");
                break;

            //Em Horario Extra
            case EXTRA:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("QU3Ro_S3us_r3curs0s.py\n");
                break;

            default:
                break;
        }

    }
}

