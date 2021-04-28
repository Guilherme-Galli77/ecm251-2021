package galli.cury.guilherme.pedra_papel_tesoura.models.classico;

import galli.cury.guilherme.pedra_papel_tesoura.models.Jogada;
import galli.cury.guilherme.pedra_papel_tesoura.models.plus.Lagarto;
import galli.cury.guilherme.pedra_papel_tesoura.models.plus.Spok;

public class Tesoura extends Jogada {

    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Spok) || (jogada instanceof Pedra);
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}