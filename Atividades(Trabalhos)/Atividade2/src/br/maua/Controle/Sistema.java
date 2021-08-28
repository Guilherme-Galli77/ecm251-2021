package br.maua.Controle;

import br.maua.Enums.*;
import br.maua.Models.*;

import java.io.IOException;
import java.util.Scanner;


/**
 * Sistema do código
 */
public class Sistema{

    final private static Scanner scanner = new Scanner(System.in);
    final private static ControleLista lista = new ControleLista();
    private static Horarios HoraAtual = Horarios.REGULAR;


    /**
     * Metodo que comanda o funcionamento do sistema e trabalha com o tratamento de exceções
     * @throws InterruptedException lança uma exceção do tipo InterruptedException
     * @throws IOException lança uma exceção do tipo IO
     */
    public static void run() throws InterruptedException, IOException {
        boolean running = true;

        //Limpa os files ao inicializar
        ControleLista.Limpa();

        while(running){
        System.out.println("******* Bem Vindo ao Mask_Society *******\n");
        System.out.println(

                "--------MENU DE OPÇÕES--------\n" +
                "HORARIO ATUAL: " + HoraAtual + "\n" +
                "1 - Cadastrar um novo Membro.\n"+
                "2 - Postar mensagem.\n" +
                "3 - Exibir Relatório de Informações.\n" +
                "4 - Remover um Membro.\n" +
                "5 - Verificar Horário\n"+
                "6 - Trocar o horário de trabalho.\n" +
                "7 - Encerrar o Sistema.\n"+
                "Digite a sua Opção: "
        );

        int input = scanner.nextInt();
        switch (input){
            //Cadastrar um novo Membro.
            case 1 :
                Cadastro cadastro = new Cadastro();

                Membro membro = cadastro.Listar();
                if (membro != null) {
                    lista.AddMembro(membro);
                    System.out.println("Membro Adicionado!");
                    lista.getListaDeMembros();
                }
                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            //Postar mensagem
            case 2:
                for(int i = 0;i<lista.getListaDeMembros().size();i++) {
                    System.out.println("MEMBRO " + i + " :");
                    lista.getListaDeMembros().get(i).Mensagem(HoraAtual);
                }
                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            //Exibir Relatório de Informações
            case 3:
                for(int i = 0;i<lista.getListaDeMembros().size();i++){
                    System.out.println("MEMBRO "+ i + " :");
                    lista.getListaDeMembros().get(i).ExibirRelatorio();
                }

                System.out.println("\nPress Enter to Continue...");
                System.in.read();
                break;

            //Remover um Membro
            case 4:
                for(int i = 0;i<lista.getListaDeMembros().size();i++){
                    System.out.println("MEMBRO "+ i + " :");
                    lista.getListaDeMembros().get(i).ExibirRelatorio();
                }
                System.out.println("Escolha um Membro para Remover: ");

                int remove = scanner.nextInt();
                if(remove<lista.getListaDeMembros().size()) {
                    lista.RemoverMembro(lista.getListaDeMembros().get(remove));
                    System.out.println("Membro "+ remove +"Removido Com Sucesso!");
                }else{
                    System.out.println("Opção Invalida.");
                }

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            //Verificar Horário
            case 5:
                System.out.println("Estamos em Horário: " + HoraAtual + ".\n");

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            //Trocar o horário de trabalho
            case 6:
                if(HoraAtual == Horarios.REGULAR) {
                    HoraAtual = Horarios.EXTRA;
                } else {
                    HoraAtual = Horarios.REGULAR;
                }
                System.out.println("Troca De Horário Realizada com Sucesso.\n");
                System.out.println("Agora Estamos em Horario:"+HoraAtual);

                System.out.println("Press Enter to Continue...");
                System.in.read();
                break;

            //Encerrar o Sistema
            case 7:
                System.out.println("Encerrando Sistema...");
                running = false;
                break;

            //Caso Default
            default:
                System.out.println("Opção Inválida!");
                break;

            }
        }
    }
}