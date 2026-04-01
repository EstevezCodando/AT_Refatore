public class Main {

    public static void main(String[] args) {
        User usuario = new User("Jean", "jean@email.com");

        usuario.addAddress(new Address("Rua A", "Brasília", "DF", "70000-000"));
        usuario.addAddress(new Address("Rua B", "Rio de Janeiro", "RJ", "20000-000"));

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());

        for (Address endereco : usuario.getEnderecos()) {
            System.out.println(endereco);
        }
    }
}