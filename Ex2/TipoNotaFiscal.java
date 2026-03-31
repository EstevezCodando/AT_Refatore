package Ex2;

public enum TipoNotaFiscal {
    SIMPLES("Nota fiscal simples", "Simples"),
    COM_IMPOSTO("Nota fiscal com imposto", "Com imposto"),
    DESCONHECIDO("Tipo desconhecido", "Desconhecido");

    private final String descricaoProcessamento;
    private final String descricaoExibicao;

    TipoNotaFiscal(String descricaoProcessamento, String descricaoExibicao) {
        this.descricaoProcessamento = descricaoProcessamento;
        this.descricaoExibicao = descricaoExibicao;
    }

    public String getDescricaoProcessamento() {
        return descricaoProcessamento;
    }

    public String getDescricaoExibicao() {
        return descricaoExibicao;
    }
}