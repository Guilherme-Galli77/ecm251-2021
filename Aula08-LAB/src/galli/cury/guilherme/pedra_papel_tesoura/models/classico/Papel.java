package galli.cury.guilherme.pedra_papel_tesoura.models.classico;

import galli.cury.guilherme.pedra_papel_tesoura.models.Jogada;

public class Papel extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
