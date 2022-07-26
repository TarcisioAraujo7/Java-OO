public class Autor {
    private String nome;
    private String email;
    private Integer idade;

	public Autor(String nome){
		this.nome = nome;
	}

    void mostrarAutor() {
		System.out.println("-----------------------------");
		System.out.println("Detalhes do autor");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Email: " + email);
	}

	String getNome(){
		return nome;
	}
	void setNome(String nome){
		this.nome = nome;
	}

	String getEmail(){
		return email;
	}
	void setEmail(String email){
		this.email = email;
	}

	Integer getIdade(){
		return idade;
	}
	void setIdade(Integer idade){
		this.idade = idade;
	}
}
