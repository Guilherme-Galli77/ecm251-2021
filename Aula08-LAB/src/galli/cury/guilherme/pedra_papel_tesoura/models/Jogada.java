package galli.cury.guilherme.pedra_papel_tesoura.models;

import galli.cury.guilherme.pedra_papel_tesoura.enumeracoes.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHOU;
        }
        if (verificarSePerdi(jogada)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }
    public abstract boolean verificarSeGanhei(Jogada jogada);

    public abstract boolean verificarSePerdi(Jogada jogada);
}
