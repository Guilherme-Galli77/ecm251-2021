package galli.cury.guilherme;

public class Contas {
    //Informações de uma conta
    private int idConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public int getIdConta(){
        return idConta;
    }


    //Métodos
    public Contas(int idConta, double saldo){
        this.saldo = saldo;
        this.idConta = idConta;
    }


    public boolean sacar(double valor) {
        if (this.saldo>=valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean transferirDinheiro(Contas destino, double valor) {
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}

}
