import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoCompras{
    
    List<Livro> carrinho = new ArrayList<Livro>();
    Double total;

    public CarrinhoCompras(){
        total = 0.0;
    }

    public void addLivro(Livro livro, Scanner scan){
        carrinho.add(livro);
        System.out.println("O livro " + livro.getNome() + " custa " + livro.getValor() + "R$, deseja adicionar ao seu carrinho?");
        System.out.println("[S] Sim.\n[N] Nao.");
        String resposta = scan.nextLine();
        total =+ livro.getValor();
        System.out.println("Voce adicionou o livro: " + livro);
    }    
    
}