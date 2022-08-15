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
        System.out.println("O livro " + livro.getNome() + " custa " + livro.getValor() + "R$, deseja adicionar ao seu carrinho?\n");
        System.out.println("[S] Sim.\n[N] Nao.");
        String resposta = scan.nextLine().toUpperCase();
        if(resposta.equals("S")){
            total += livro.getValor();
            System.out.println("Voce adicionou o livro: " + livro);
            System.out.printf("Valor total no carrinho: %.2f\n", total);
        }   
    }
    
    public void exibirCarrinho(){
        Integer tamanho = carrinho.size();
        System.out.println("Livros no carrinho");
        for(Integer i = 0; i != tamanho; i++){
            Livro livroAtual = carrinho.get(i);
            String nomeLivro = livroAtual.getNome();
            String ajuste = " ".repeat(15 - nomeLivro.length()); 
            System.out.println("(" + (i+1) +") " + nomeLivro + ajuste + livroAtual.getValor() );
        }
        System.out.println("\nTotal:             " + total);
    }
}