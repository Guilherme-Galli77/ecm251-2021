package galli.cury.guilherme;

public class Contas {

    //Atributos de uma conta

    private int idConta;
    private double saldo;
    private static int numContas = 0;
    private String QRCode;

    //Construtor
    public Contas(double saldo) {
        numContas += 1;
        this.idConta = numContas;   // OBS: O ID DE CADA CONTA SERA IGUAL AO "NÚMERO DE CRIAÇÃO" DA CONTA
        this.saldo = saldo;
    }

    //Getters

    public int getIdConta(){
        return this.idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getQRCode() {
        return this.QRCode;
    }

    //Métodos


    public void gravarQRCode(String nome, double valor) {
        this.QRCode = Transacoes.gerarQRCode(this.idConta, nome, valor);    //GRAVA O QR CODE NA CONTA DO USUÁRIO
    }


    public static void receber(Contas conta,double valor) {
        conta.saldo += valor;
    }

    public static void pagar(Contas conta,double valor) {
            conta.saldo -= valor;
    }


    @Override
    public String toString() {
        return "{" +
                " idConta='" + getIdConta() + "'" +
                ", saldo='" + getSaldo() + "'" +
                ", QRCode='" + getQRCode() + "'" +
                "}";
    }
}
