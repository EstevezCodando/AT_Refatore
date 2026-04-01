public class CalculadoraPreco {

    private static final int CLIENTE_COMUM = 1;
    private static final int CLIENTE_PREMIUM = 2;

    public double calcularPrecoFinal(double precoBase, int tipoCliente, boolean ehFeriado) {
        double desconto = calcularDesconto(tipoCliente, ehFeriado);
        return aplicarDesconto(precoBase, desconto);
    }

    private double calcularDesconto(int tipoCliente, boolean ehFeriado) {
        double desconto = obterDescontoPorTipoCliente(tipoCliente);

        if (ehFeriado) {
            desconto += 0.05;
        }

        return desconto;
    }

    private double obterDescontoPorTipoCliente(int tipoCliente) {
        if (tipoCliente == CLIENTE_COMUM) {
            return 0.10;
        }

        if (tipoCliente == CLIENTE_PREMIUM) {
            return 0.15;
        }

        return 0.0;
    }

    private double aplicarDesconto(double precoBase, double desconto) {
        return precoBase * (1 - desconto);
    }
}