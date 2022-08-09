import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras{
    
    List<Livro> carrinho = new ArrayList<Livro>();

    public void addLivro(Livro livro){
        carrinho.add(livro);
        System.out.println("Voce adicionou o livro: " + livro);
    }    
    
}