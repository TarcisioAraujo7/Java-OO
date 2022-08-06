public class Cadastro_de_livros {
    public static void main(String[] args) throws Exception {

        Autor autor1 = new Autor();
        autor1.setNome("Stephen King");
        autor1.setEmail("StKing@yahoo.com");
        autor1.setIdade(74);

        Livro livro1 = new Livro(autor1);
        livro1.setNome("O instituto");
        livro1.setDescricao("Livro de suspense");
        livro1.setValor(50);
        livro1.setCodigo("978-10-82198-11-9");

        livro1.mostrarDados();

        Livro livro2 = new Livro(autor1);
        livro2.setNome ("It a coisa");
        livro2.setDescricao("Livro de terror");
        livro2.setValor(44.50);
        livro2.setCodigo("124-42-15232-13-6");

        livro2.mostrarDados();
        livro2.aplicaDesconto(0.12);
        livro2.mostrarDados();

        Autor autor2 = new Autor();
        autor2.setNome("Rafael Lange");
        autor2.setEmail("cllbt@email.com");
        autor2.setIdade(29);

        Ebook ebook1 = new Ebook(autor2);
        ebook1.setNome("Ordem Paranormal, o comeco");
        ebook1.setDescricao("Terror e medo");
        ebook1.setValor(100);
        ebook1.setCodigo("193-15-51374-64-8");
        ebook1.setWaterMark("Cellbit");

        ebook1.aplicaDesconto(0.32);

        ebook1.mostrarDados();

    }
}
