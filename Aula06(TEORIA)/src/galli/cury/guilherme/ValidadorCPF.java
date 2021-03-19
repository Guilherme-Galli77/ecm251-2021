package galli.cury.guilherme;

public class ValidadorCPF {
    private static final String[] invalidosConhecidos = {
            "00000000000","11111111111", "22222222222",
            "33333333333", "44444444444", "55555555555",
            "66666666666", "77777777777", "88888888888", "99999999999"
    };
    private static final int TAMANHO_CPF = 11;
    public static boolean validarCpf(String cpf){
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-","");
        //Valida se o tamanho do CPF esta de acordo com o esperado
        if(cpf.length() != 11)
            return false;

        //Verifica se o CPF esta dentro dos invalidos conhecidos
        for (String cpfInvalido:
             invalidosConhecidos) {
            if(cpfInvalido.equals(cpf))
                return false;
        }

        //Validação do primeiro e do segundo digito
        //PAREI NOS 32 MINUTOS DA AULA

        return true;
    }
}
