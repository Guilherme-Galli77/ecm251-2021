package galli.cury.guilherme;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    private Contas conta;




    public Usuarios(String nome,String senha ,String email, double valor){
        this.nome = nome;
        this.senha = senha;

    }

    public int getidConta(){
        return this.conta.getIdConta();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}