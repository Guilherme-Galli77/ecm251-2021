package galli.cury.guilherme.pedra_papel_tesoura.models.plus;

import galli.cury.guilherme.pedra_papel_tesoura.models.Jogada;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Papel;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Pedra;
import galli.cury.guilherme.pedra_papel_tesoura.models.classico.Tesoura;

public class Spok extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Tesoura(), new Pedra()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spok";
    }
}

