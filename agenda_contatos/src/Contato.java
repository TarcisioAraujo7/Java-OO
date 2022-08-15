public class Contato {
	private String nome;
	private String numero;
	
	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void mostrarContato() {
		System.out.println("Nome:" + nome);
		System.out.println("Numero: " + numero);
		System.out.println("--------------------------");
	}
	
}