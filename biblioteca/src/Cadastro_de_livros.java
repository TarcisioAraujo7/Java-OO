public class Cadastro_de_livros {
    public static void main(String[] args) throws Exception {

        Autor autor1 = new Autor();
        autor1.nome = "Stephen King";
        autor1.email = "StKing@yahoo.com";
        autor1.idade = 74;

        Livro livro1 = new Livro();
        livro1.nome = "O instituto";
        livro1.descricao = "Livro de suspense";
        livro1.addValor(50);
        livro1.isbn = "978-10-82198-11-9";
        livro1.autor = autor1;

        livro1.mostrarDados();

        Livro livro2 = new Livro();
        livro2.nome = "It a coisa";
        livro2.descricao = "Livro de terror";
        livro2.addValor(44.50);
        livro2.isbn = "124-42-15232-13-6";
        livro2.autor = autor1;

        livro2.mostrarDados();

    }
}
