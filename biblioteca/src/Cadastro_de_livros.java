public class Cadastro_de_livros {
    public static void main(String[] args) throws Exception {

        Autor autor1 = new Autor();
        autor1.setNome("Stephen King");
        autor1.setEmail("StKing@yahoo.com");
        autor1.setIdade(74);

        Livro livro1 = new Livro();
        livro1.setNome("O instituto");
        livro1.setDescricao("Livro de suspense");
        livro1.setValor(50);
        livro1.setCodigo("978-10-82198-11-9");
        livro1.setAutor(autor1);

        livro1.mostrarDados();

        Livro livro2 = new Livro();
        livro2.setNome ("It a coisa");
        livro2.setDescricao("Livro de terror");
        livro2.setValor(44.50);
        livro2.setCodigo("124-42-15232-13-6");
        livro2.setAutor(autor1);

        livro2.mostrarDados();

    }
}
