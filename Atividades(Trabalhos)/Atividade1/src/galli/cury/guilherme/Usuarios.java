package galli.cury.guilherme;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    private Contas conta;


    public String getNome() {
        return nome;
    }

    public Contas getConta() {
        return conta;
    }

    public int getidConta(){
        return this.conta.getIdConta();
    }

    public Usuarios(String nome, String senha , String email, double valor){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.conta = new Contas(valor);
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