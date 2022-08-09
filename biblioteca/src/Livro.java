import java.util.Scanner;

public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

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

    public void addDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Adicionando novo livro");

        System.out.println("Insira o nome do livro: ");
        nome = scan.nextLine();

        System.out.println("Insira a descricao do livro: ");
        descricao = scan.nextLine();

        System.out.println("Insira o preco do livro: ");
        valor = scan.nextDouble();
        scan.nextLine();

        System.out.println("Insira o codigo do livro: ");
        isbn = scan.nextLine();
        System.out.println("-----------------------------");
        scan.close();
    }

    public Livro(Autor autor){
        this.autor = autor;
        this.descricao = "Descricao vazia";
        this.isbn = "000-00-00000-00-0";
    }

    void aplicaDesconto(Double porcentagem) {
        if (porcentagem > 0.3){
            System.out.println("O desconto não pode passar de 30%");
        }
		this.valor -= this.valor * porcentagem;
	}

	boolean temAutor() {
		return this.autor != null;
	}

    void setNome(String name){
        this.nome = name;
    }
    String getNome(){
        return nome;
    }

    void setDescricao(String desc){
        this.descricao = desc;
    }
    String getDescricao(){
        return descricao;
    }

    void setValor(double value){
        this.valor = value;
    }
    double getValor(){
        return valor;
    }

    void setCodigo(String cod){
        this.isbn = cod;
    }
    String getCodigo(){
        return isbn;
    }

    void setAutor(Autor autor){
        this.autor = autor;
    }
    Autor getAutor(){
        return autor;
    }

}