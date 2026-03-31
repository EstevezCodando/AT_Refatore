public class TesteClassificador {

    public static void main(String[] args) {
        Classificador classificador = new Classificador();

        deveClassificarComoAlto(classificador);
        deveClassificarComoMedio(classificador);
        deveClassificarComoBaixo(classificador);
        deveClassificarComoCasoRaro(classificador);

        System.out.println("Todos os testes passaram.");
    }

    private static void deveClassificarComoAlto(Classificador classificador) {
        validar(classificador.classificar(11), TipoClassificacao.ALTO, "Valor maior que 10 deve ser ALTO");
    }

    private static void deveClassificarComoMedio(Classificador classificador) {
        validar(classificador.classificar(10), TipoClassificacao.MEDIO, "Valor igual a 10 deve ser MÉDIO");
    }

    private static void deveClassificarComoBaixo(Classificador classificador) {
        validar(classificador.classificar(3), TipoClassificacao.BAIXO, "Valor menor que 10 deve ser BAIXO");
    }

    private static void deveClassificarComoCasoRaro(Classificador classificador) {
        validar(classificador.classificar(-9999), TipoClassificacao.CASO_RARO, "Código especial deve ser CASO RARO");
    }

    private static void validar(TipoClassificacao obtido, TipoClassificacao esperado, String mensagemErro) {
        if (obtido != esperado) {
            throw new IllegalStateException(
                    mensagemErro + ". Esperado: " + esperado + ", obtido: " + obtido);
        }
    }
}