package galli.cury.guilherme.pedra_papel_tesoura.models.plus;

import galli.cury.guilherme.pedra_papel_tesoura.models.Jogada;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Papel;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Spok extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Pedra);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spok";
    }
}

