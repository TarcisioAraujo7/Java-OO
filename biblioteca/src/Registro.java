import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Registro {

    private static List<Livro> servidor_livros = new ArrayList<Livro>();
    private static List<Autor> servidor_autores = new ArrayList<Autor>();

    public static Livro getLivro(String nome){

        Iterator<Livro> it = servidor_livros.iterator();
         while ( it.hasNext()) {
            Livro livro = it.next();
            if ( livro.getNome().equals( nome )) {
                
                return livro;
            }
         }
         return null;
    }

    public static Autor getAutor(String nome){

        Iterator<Autor> it = servidor_autores.iterator();
         while ( it.hasNext()) {
            Autor autor = it.next();
            if ( autor.getNome().equals( nome )) {
                
                return autor;
            }
         }
         return null;
    }

    public static Boolean temAutor(String nome){
        if(getAutor(nome) != null){
            return true;
        } else{
            return false;
        }
    }

    public static void novoLivro(Livro livro, Scanner sc){
        

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

    public static void novoAutor(Autor autor, Scanner sc){
        
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

