package galli.guilherme;

public class Conta {
    //Atributos
    Cliente cliente;
    int numero;
    double saldo;

    //Metodos
    void visualizarSaldo() {
        double saldo = 50;
        System.out.println("Valor do Saldo: R$" + this.saldo);
    }
    boolean sacar(double valor) {
        if (this.saldo>=valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    boolean transferirDinheiro(Conta destino, double valor) {
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente.toString() +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
