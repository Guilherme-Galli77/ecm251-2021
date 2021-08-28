package br.maua.Controle;

import br.maua.Enums.TiposMembros;
import br.maua.Models.*;

import java.io.*;
import java.util.*;


public class Cadastro {

    /**
     * Scanner
     */
    final private static Scanner scanner = new Scanner(System.in);


    /**
     * Metodo responsável pelo cadastro de usuarios
     * @param func função do usuario
     * @param nome nome do usuario
     * @param email email do usuario
     * Utiliza um try e catch para tratamento de exceções
     */
    public static void Cadastrar(String func, String nome, String email){
        File fw = null;
        try {
            fw = new File("Dados.txt");
            FileWriter fwArquivo = null;

            // Verifica se o arquivo existe
            // Se existir, ele abre par adicionar dados
            // se nao existir, ele cria o arquivo
            if (fw.exists() == true) {
                fwArquivo = new FileWriter(fw, true);
            } else {
                fwArquivo = new FileWriter(fw);
            }

            BufferedWriter bw = new BufferedWriter(fwArquivo);

            //escreve o registro no arquivo e pula uma linha com o \n
            bw.write(func+"; "+nome+"; "+email+"\n");

            //fecha o arquivo
            bw.close();
            fwArquivo.close();

        } catch (Exception e) {
            System.err.println("Erro ao inserir linhas no arquivo: " + fw);
        }

        List<Dados> dados = new ArrayList<>();
        File file = new File("Dados.txt");

        //Realiza a leitura do conteúdo desse arquivo
        try{
            //Cria elemento para iterar pelo arquivo
            Scanner scanner = new Scanner(file);
            //Passa por todos os elementos do arquivo
            while(scanner.hasNext()){
                int i = 0;
                String linha = scanner.nextLine();
                dados.add(Dados.pegaDados(linha));
            }

            //Criação do CSV
            FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
            fileWriter.write("=== Dados dos Usuarios ===\n");
            fileWriter.write("Funcao;Nome;Email;ID\n");
            int ID = 0;
            for (Dados dado : dados) {
                fileWriter.append(dado.funcao+"; "+dado.nome+"; "+dado.email+"; "+ID+"\n");
                ID++;
            }
            fileWriter.close();
        }
        catch (Exception exception){
            System.out.println("Algo deu errado:");
        }
    }

    /**
     * Metodo que esta ligado a criação e seleção de membros
     * @return retorna o resultado conforme a opção escolhida
     */
    public static Membro Listar(){

        System.out.println("Nome do usuário:");
        String nome = scanner.next();

        System.out.println("Email do usuário:");
        String email = scanner.next();

        System.out.println("Opções de Membros Disponiveis:");
        System.out.println(
                        "1 - Big Brother.\n"+
                        "2 - Heavy Lifter.\n" +
                        "3 - Script Guy.\n" +
                        "4 - Mobile Member.\n" +
                        "5 - Cancelar.\n"+
                        "Digite a sua Opção: "
        );
        int input = scanner.nextInt();
        switch (input){

            //Se for um BigBrother
            case 1:
                Cadastrar("Big Brothers",nome,email);
                return new BigBrothers(nome, email, TiposMembros.BigBrothers);

            //Se for um HeavyLifter
            case 2:
                Cadastrar("Heavy Lifters",nome,email);
                return new HeavyLifters(nome,email, TiposMembros.HeavyLifters);

            //Se for um ScriptGuy
            case 3:
                Cadastrar("Script Guys",nome,email);
                return new ScriptGuys(nome,email, TiposMembros.ScriptGuys);

            //Se for um MobileMember
            case 4:
                Cadastrar("Mobile Members",nome,email);
                return new MobileMembers(nome,email, TiposMembros.MobileMembers);

            //Caso deseje voltar
            case 5:
                System.out.println("Voltando ao Menu Principal...");
                return null;

            //Case Default
            default:
                System.out.println("Opção Invalida.");
                return null;
        }
    }
}