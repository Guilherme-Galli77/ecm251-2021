/* Fernando Laiser Freire Kon 19.01336-0
    Guilherme Cury Galli      19.00374-9
 */

package galli.cury.guilherme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nameUser1, email1;
        String nameUser2, email2;
        String nameUser3, email3;

        // Digitação dos nomes dos usuários

        System.out.println("Digite o nome da primeira conta: ");
        nameUser1 = input.nextLine();

        System.out.println("Digite o nome da segunda conta: ");
        nameUser2 = input.nextLine();

        System.out.println("Digite o nome da terceira conta: ");
        nameUser3 = input.nextLine();

        // Email dos usuários

        email1 = nameUser1.replaceAll(" ","");
        email2 = nameUser2.replaceAll(" ","");
        email3 = nameUser3.replaceAll(" ","");

        // Criação dos usuários

        System.out.println();       // Pular uma linha
        Usuarios user1 = new Usuarios(nameUser1, "123", email1+"@maua.br");
        Usuarios user2 = new Usuarios(nameUser2, "456", email2+"@maua.br");
        Usuarios user3 = new Usuarios(nameUser3, "789", email3+"@maua.br");

        // Criação das contas

        user1.criarConta(1000.0);
        user2.criarConta(250.0);
        user3.criarConta(3000.0);

        // Situações bancárias iniciais

        System.out.println("Situação Inicial:");
        System.out.println("Nome de usuário: " +user1.getNome()+"- Saldo: "+user1.getConta().getSaldo()+" R$");
        System.out.println("Nome de usuário: " +user2.getNome()+"- Saldo: "+user2.getConta().getSaldo()+" R$");
        System.out.println("Nome de usuário: " +user3.getNome()+"- Saldo: "+user3.getConta().getSaldo()+" R$");
        System.out.println();

        // Operações bancárias

        user1.requisitar(250);
        user2.depositar(user1);
        user3.depositar(user1);
        user2.depositar(user1);
        user2.requisitar(1000);
        user3.depositar(user2);
        System.out.println();

        // Situações bancárias finais

        System.out.println("Situação Final:");
        System.out.println("Nome de usuário: " +user1.getNome()+"- Saldo: "+user1.getConta().getSaldo()+" R$");
        System.out.println("Nome de usuário: " +user2.getNome()+"- Saldo: "+user2.getConta().getSaldo()+" R$");
        System.out.println("Nome de usuário: " +user3.getNome()+"- Saldo: "+user3.getConta().getSaldo()+" R$");

    }
}