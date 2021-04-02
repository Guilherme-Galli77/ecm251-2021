/* Fernando Laiser Freire Kon 19.01336-0
    Guilherme Cury Galli      19.00374-9
 */



package galli.cury.guilherme;

public class Main {

    public static void main(String[] args) {


        // Criação dos usuários
        System.out.println();       // Pular uma linha
        Usuarios user1 = new Usuarios("All Might", "123", "allmight@maua.br");
        Usuarios user2 = new Usuarios("One For All", "456", "oneforall@maua.br");
        Usuarios user3 = new Usuarios("Bakugo", "789", "bakugo@maua.br");

        // Criação das contas
        user1.criarConta(1000.0);
        user2.criarConta(250.0);
        user3.criarConta(3000.0);

        // Situações bancárias iniciais
        System.out.println("Situação Inicial:");
        System.out.println(user1.getNome()+": "+user1.getConta().getSaldo()+" R$");
        System.out.println(user2.getNome()+": "+user2.getConta().getSaldo()+" R$");
        System.out.println(user3.getNome()+": "+user3.getConta().getSaldo()+" R$");
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
        System.out.println(user1.getNome() + ": " + user1.getConta().getSaldo() +" R$");
        System.out.println(user2.getNome() + ": " + user2.getConta().getSaldo() +" R$");
        System.out.println(user3.getNome() + ": " + user3.getConta().getSaldo() +" R$");
    }
}

