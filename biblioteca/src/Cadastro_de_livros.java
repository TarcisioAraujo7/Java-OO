public class Cadastro_de_livros {
    public static void main(String[] args) throws Exception {

        Autor autor1 = new Autor();
        autor1.setNome("Stephen King");
        autor1.setEmail("StKing@yahoo.com");
        autor1.setIdade(74);

        Livro livro1 = new LivroFisico(autor1);
        livro1.addDados();
        livro1.mostrarDados();

        Livro livro2 = new LivroFisico(autor1);
        livro2.addDados();
        livro2.mostrarDados();

        livro2.aplicaDesconto(0.12);
        livro2.mostrarDados();

        Autor autor2 = new Autor();
        autor2.setNome("Rafael Lange");
        autor2.setEmail("cllbt@email.com");
        autor2.setIdade(29);

        Ebook ebook1 = new Ebook(autor2);

        ebook1.aplicaDesconto(0.32);

        ebook1.mostrarDados();

        CarrinhoCompras carrinho1 = new CarrinhoCompras();
        carrinho1.addLivro(ebook1);
        
    }
}
