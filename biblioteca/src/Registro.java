import java.util.Scanner;

public class Registro {

    public void novo(Livro livro){
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("Adicionando novo livro");

        System.out.println("Insira o nome do livro: ");
        livro.setNome(scan.nextLine());

        System.out.println("Insira a descricao do livro: ");
        livro.setDescricao(scan.nextLine());

        System.out.println("Insira o preco do livro: ");
        livro.setValor(scan.nextDouble());
        scan.nextLine();

        System.out.println("Insira o codigo do livro: ");
        livro.setCodigo(scan.nextLine());
        System.out.println("-----------------------------");
        scan.close();
    }
    
}

