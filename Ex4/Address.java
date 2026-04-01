public class Address {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    public Address(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public String toString() {
        return "Rua: " + rua
                + ", Cidade: " + cidade
                + ", Estado: " + estado
                + ", CEP: " + cep;
    }
}