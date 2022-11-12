import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtosDisponiveis;

    public List<Produto> getProdutoDisponiveis() {
        return produtosDisponiveis;
    }

    public Loja(){
        produtosDisponiveis = new ArrayList<Produto>();
    }

    public void addJogo(Jogo jogo) {
        produtosDisponiveis.add(jogo);
    }

    public void addAlbum(AlbumMusical albo) {
        produtosDisponiveis.add(albo);
    }
}
