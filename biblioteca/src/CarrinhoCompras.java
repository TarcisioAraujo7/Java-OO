import java.util.List;

public class CarrinhoCompras{

    List<Livro> carrinho;

    public void addLivro(Livro livro){
        carrinho.add(livro);
        System.out.println("Voce adicionou o livro: " + livro);
    }    
    
}