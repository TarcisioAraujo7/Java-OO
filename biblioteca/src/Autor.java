public class Autor {
    String nome;
    String email;
    Integer idade;

    void mostrarAutor() {
		System.out.println("Detalhes do autor:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Email: " + email);
		System.out.println("-----------------------------");
	}
}
