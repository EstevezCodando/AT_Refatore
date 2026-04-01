import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

    private String nome;
    private String email;
    private List<Address> enderecos;

    public User(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void addAddress(Address endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("O endereço não pode ser nulo.");
        }
        enderecos.add(endereco);
    }

    public List<Address> getEnderecos() {
        return Collections.unmodifiableList(enderecos);
    }
}