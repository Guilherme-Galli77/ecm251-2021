package galli.cury.guilherme.pedra_papel_tesoura.models.plus;

import galli.cury.guilherme.pedra_papel_tesoura.models.Jogada;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Papel;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Spok(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }
    @Override
    public String toString() {
        return "Lagarto";
    }
}
