public enum TipoClassificacao {
    ALTO("ALTO"),
    MEDIO("MÉDIO"),
    BAIXO("BAIXO"),
    CASO_RARO("CASO RARO");

    private final String descricao;

    TipoClassificacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}