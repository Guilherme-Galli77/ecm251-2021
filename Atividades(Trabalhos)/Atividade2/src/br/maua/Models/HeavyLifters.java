package br.maua.Models;

import br.maua.Enums.Horarios;
import br.maua.Enums.TiposMembros;

public class HeavyLifters extends Membro{


    /**
     * Metodo/Classe que representa a função HeavyLifters
     * @param nome nome do integrante
     * @param email email do integrante
     * @param funcao funcao do integrante
     */
    public HeavyLifters(String nome, String email, TiposMembros funcao){
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
    public void Mensagem(Horarios horario) {
        switch (horario) {

            //Em Horario Regular
            case REGULAR:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("Podem contar conosco!\n");
                break;

            //Em Horario Extra
            case EXTRA:
                System.out.println(getFuncao()+" de nome "+getNome() + ": ");
                System.out.println("N00b_qu3_n_Se_r3pita.bat\n");
                break;

            default:
                break;
        }


    }
}
