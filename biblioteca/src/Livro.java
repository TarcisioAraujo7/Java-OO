public class Livro {

    String nome;
    String descricao;
    private double valor;
    String isbn;
    Autor autor;

    void mostrarDados(){
        System.out.println("Informacoes do livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.printf("Preco: %.2f \n", valor);
        System.out.println("Codigo: "+isbn);
        if (temAutor()) {
			autor.mostrarAutor();
        }
        System.out.println("-----------------------------");
    }

    void aplicaDesconto(Double porcentagem) {
        if (porcentagem > 0.3){
            System.out.println("O desconto não pode passar de 30%");
        }
		this.valor -= this.valor * porcentagem;
	}

    void addValor(double value){
        this.valor = value;
    }

	boolean temAutor() {
		return this.autor != null;
	}
}