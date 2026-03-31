public class Classificador {

    private static final int CODIGO_CASO_RARO = -9999;
    private static final int LIMITE_MEDIO = 10;

    public TipoClassificacao classificar(int valor) {
        if (ehCasoRaro(valor)) {
            return TipoClassificacao.CASO_RARO;
        }

        if (ehAlto(valor)) {
            return TipoClassificacao.ALTO;
        }

        if (ehMedio(valor)) {
            return TipoClassificacao.MEDIO;
        }

        return TipoClassificacao.BAIXO;
    }

    private boolean ehCasoRaro(int valor) {
        return valor == CODIGO_CASO_RARO;
    }

    private boolean ehAlto(int valor) {
        return valor > LIMITE_MEDIO;
    }

    private boolean ehMedio(int valor) {
        return valor == LIMITE_MEDIO;
    }
}