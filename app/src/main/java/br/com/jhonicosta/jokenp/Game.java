package br.com.jhonicosta.jokenp;

import java.util.Random;

public class Game {

    private TipoJogadas jogadaCPU;
    private TipoJogadas jogadaJogador;
    private Random random;

    public Game() {

    }

    public String jogada(TipoJogadas jogada) {
        this.jogadaJogador = jogada;

        if (jogadaCPU.equals(TipoJogadas.PAPEL)) {
            if (jogadaJogador.equals(TipoJogadas.PAPEL)) {
                return "Empate";
            }
            if (jogadaJogador.equals(TipoJogadas.PEDRA)) {
                return "Vitória do CPU";
            }
            if (jogadaJogador.equals(TipoJogadas.TESOURA)) {
                return "Vitória do Jogador";
            }
        }
        if (jogadaCPU.equals(TipoJogadas.PEDRA)) {
            if (jogadaJogador.equals(TipoJogadas.PAPEL)) {
                return "Vitória do Jogador";
            }
            if (jogadaJogador.equals(TipoJogadas.PEDRA)) {
                return "Empate";
            }
            if (jogadaJogador.equals(TipoJogadas.TESOURA)) {
                return "Vitória do CPU";
            }
        }
        if (jogadaCPU.equals(TipoJogadas.TESOURA)) {
            if (jogadaJogador.equals(TipoJogadas.PAPEL)) {
                return "Vitória do CPU";
            }
            if (jogadaJogador.equals(TipoJogadas.PEDRA)) {
                return "Vitória do Jogador";
            }
            if (jogadaJogador.equals(TipoJogadas.TESOURA)) {
                return "Empate";
            }
        }
        return null;
    }

    public int jogadaCPU() {
        this.random = new Random();
        this.jogadaCPU = TipoJogadas.toEnum(random.nextInt(3));
        return this.jogadaCPU.getCod();
    }
}
