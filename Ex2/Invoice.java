package Ex2;

public class Invoice {
    private String nomeCliente;
    private String emailCliente;
    private double valor;
    private TipoNotaFiscal tipo;

    public Invoice(String nomeCliente, String emailCliente, double valor, TipoNotaFiscal tipo) {
        this.nomeCliente = nomeCliente;
        this.emailCliente = emailCliente;
        this.valor = valor;
        this.tipo = tipo;
    }

    public void processar() {
        if (emailInvalido()) {
            System.out.println("Email inválido. Falha no envio.");
            return;
        }

        System.out.println(tipo.getDescricaoProcessamento());

        String nota = gerarConteudoNota();
        System.out.println(nota);
        enviarPorEmail(emailCliente, nota);
    }

    private boolean emailInvalido() {
        return emailCliente == null || !emailCliente.contains("@");
    }

    private String gerarConteudoNota() {
        return "--- NOTA FISCAL ---\n"
                + "Cliente: " + nomeCliente + "\n"
                + "Valor: R$ " + valor + "\n"
                + "Tipo: " + tipo.getDescricaoExibicao() + "\n"
                + "---------------------";
    }

    private void enviarPorEmail(String email, String conteudo) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Conteúdo:\n" + conteudo);
    }
}