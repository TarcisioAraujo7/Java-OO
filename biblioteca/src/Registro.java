import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {

    List<Livro> servidor_livros = new ArrayList<Livro>();
    List<Autor> servidor_autores = new ArrayList<Autor>();

    public Livro getLivro(String nome){

        Integer comprimento_lista = servidor_livros.size();
        Livro livroX;
        livroX = null;
        for(Integer i = 0; i != comprimento_lista; i++){
            Livro livroAtual = servidor_livros.get(i);
    
            if(livroAtual.getNome() == nome){
                livroX = livroAtual;
            }

        }
        return livroX;
    }

    public void novoLivro(Livro livro, Scanner sc){

        servidor_livros.add(livro);
        
        System.out.println("-----------------------------");
        System.out.println("Adicionando novo livro");

        System.out.println("Insira o nome do livro: ");
        livro.setNome(sc.nextLine());

        System.out.println("Insira a descricao do livro: ");
        livro.setDescricao(sc.nextLine());

        System.out.println("Insira o preco do livro: ");
        livro.setValor(sc.nextDouble());
        sc.nextLine();

        System.out.println("Insira o codigo do livro: ");
        livro.setCodigo(sc.nextLine());

        System.out.println("-----------------------------");
    }

    public void novoAutor(Autor autor, Scanner sc){
        
        servidor_autores.add(autor);

        System.out.println("-----------------------------");
        System.out.println("Adicionando novo autor");

        System.out.println("Insira o nome do autor: ");
        autor.setNome(sc.nextLine());

        System.out.println("Insira o email do autor: ");
        autor.setEmail(sc.nextLine());

        System.out.println("Insira a idade do autor: ");
        autor.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("-----------------------------");
    }
    
}

