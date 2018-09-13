package br.com.jhonicosta.jokenp;

public enum TipoJogadas {

    PEDRA(0, "Pedra"), PAPEL(1,"Papel"), TESOURA(2, "Tesoura");

    private int cod;
    private String descricao;

    TipoJogadas(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoJogadas toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }
        for (TipoJogadas x : TipoJogadas.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id invalido: " + cod);
    }
}
