package galli.guilherme;

public class Main {
    public static void main(String[] args) {
           //Cria uma referencia para um objeto Conta
        Conta c1;
          //Instancia um objeto conta
        c1 = new Conta();
        c1.cliente = new Cliente();
        //Manipular os atributos
        c1.cliente.titular = "Guilherme";
        c1.saldo = 199.99;
        c1.numero = 1234;

        //Invocar o método visualizarSaldo()
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.saldo = 400;
        c2.cliente.titular = "Pessoa 2";
        c2.visualizarSaldo();

        c1.depositar(100);
        c1.visualizarSaldo();

        if (c2.sacar(200)) {
            System.out.println("Deu bom!");
        }else {
            System.out.println("Deu Ruim");
        }
        c2.visualizarSaldo();

        if(c1.transferirDinheiro(c2,50)) {
            System.out.println("Transferencia realizada com sucesso!");
        }else{
            System.out.println("Falha ao transferir!");
        }

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());
    }
}
