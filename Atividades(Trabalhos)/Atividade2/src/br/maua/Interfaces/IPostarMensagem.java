package br.maua.Interfaces;

import br.maua.Enums.Horarios;

public interface IPostarMensagem {

    /**
     * Interface responsável pela postagem da mensagem através da void Mensagem
     * @param horario horario em que a mensagem sera postada
     */

    public abstract void Mensagem(Horarios horario);
}
