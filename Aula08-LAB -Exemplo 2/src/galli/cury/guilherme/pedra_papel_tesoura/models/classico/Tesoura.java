package galli.cury.guilherme.pedra_papel_tesoura.models.classico;

import galli.cury.guilherme.pedra_papel_tesoura.models.Jogada;
import galli.cury.guilherme.pedra_papel_tesoura.models.plus.Lagarto;
import galli.cury.guilherme.pedra_papel_tesoura.models.plus.Spok;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Pedra(), new Spok()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}