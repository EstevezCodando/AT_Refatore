public class App {

    public static void main(String[] args) {
        CalculadoraPreco calculadora = new CalculadoraPreco();

        executarTeste(calculadora, 100.0, 1, false);
        executarTeste(calculadora, 100.0, 2, true);
    }

    private static void executarTeste(CalculadoraPreco calculadora, double precoBase, int tipoCliente,
            boolean feriado) {
        double resultado = calculadora.calcularPrecoFinal(precoBase, tipoCliente, feriado);

        System.out.println(
                "Base: " + precoBase +
                        " | Tipo: " + tipoCliente +
                        " | Feriado: " + feriado +
                        " | Final: " + resultado);
    }
}