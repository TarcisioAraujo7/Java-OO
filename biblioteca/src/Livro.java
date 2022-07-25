public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDados(){
        System.out.println("Informacoes do livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Preco: " + valor);
        System.out.println("Codigo: "+isbn);
        System.out.println("-----------------------------");
    }
}