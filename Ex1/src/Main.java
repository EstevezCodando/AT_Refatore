public class Main {

    public static void main(String[] args) {
        Classificador classificador = new Classificador();

        imprimirResultado(classificador, 11);
        imprimirResultado(classificador, 10);
        imprimirResultado(classificador, 3);
        imprimirResultado(classificador, -9999);
    }

    private static void imprimirResultado(Classificador classificador, int valor) {
        TipoClassificacao classificacao = classificador.classificar(valor);
        System.out.println(classificacao.getDescricao());
    }
}