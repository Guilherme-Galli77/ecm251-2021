package galli.cury.guilherme;

public class Contas {

    //ATRIBUTOS DE UMA CONTA

    private int idConta;
    private double saldo;
    private static int numContas = 0;
    private String QRCode;

    //CONSTRUTOR
    public Contas(double saldo) {
        numContas += 1;
        this.idConta = numContas;   // o id de cada conta será igual ao "número de criação" da conta
        this.saldo = saldo;
    }

    //GETTERS

    public int getIdConta(){
        return this.idConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getQRCode() {
        return this.QRCode;
    }

    //METODOS


    public void gravarQRCode(String nome, double valor) {
        this.QRCode = Transacoes.gerarQRCode(this.idConta, nome, valor);    //Grava o QRCode na conta do usuário
    }


    public static void receber(Contas conta,double valor) {
        conta.saldo += valor;
    }

    public static void pagar(Contas conta,double valor) {
        if (conta.saldo>=valor) {
            conta.saldo -= valor;
        }
        System.out.println("ERRO");
    }


    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                '}';
    }
}

