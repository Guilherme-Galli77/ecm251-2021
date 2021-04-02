package galli.cury.guilherme;

public class Usuarios {

    //INFORMACOES DO USUARIO

    private String nome;
    private String senha;
    private String email;
    private Contas conta;


    //CONSTRUTOR

    public Usuarios(String nome, String senha , String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }


   //GETTERS

    public String getNome() {
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public String getEmail(){
        return this.email;
    }

    public Contas getConta() {
        return this.conta;
    }


    // CRIACAO DE UMA CONTA INICIAL

    public void criarConta(double saldo){
        this.conta = new Contas(saldo);
    }



    //OPERACOES

    public String requisitar(double valor){
        this.conta.gravarQRCode(this.nome, valor);
        String QRCode = Transacoes.gerarQRCode(conta.getIdConta(), this.nome, valor);
        return QRCode;
    }

    public static boolean pagarRequisicao(Usuarios user, Usuarios userRecebe, double valor){
        if (user.getConta().getSaldo() >= valor) {
            Contas.pagar(user.getConta(), valor);
            Contas.receber(userRecebe.getConta(), valor);
            return true;
        }
        return false;
    }

    public void depositar(Usuarios user){
        String[] dados = user.conta.getQRCode().split(";");
        double valorDaConta = Double.parseDouble(dados[2]);

        if (pagarRequisicao(this, user, valorDaConta)){
            System.out.println("Depósito realizado de " + this.getNome() + " para " + user.getNome());
        } else {
            System.out.println("Saldo insuficiente no depósito de " + this.getNome() + " para " + user.getNome());
        }
    }



    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }
}