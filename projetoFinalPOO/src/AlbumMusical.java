import java.util.ArrayList;
import java.util.List;

public class AlbumMusical extends Produto{

    private List<Musica> musicas;
    private int quantidadeMusicas = musicas.size();

    public AlbumMusical(String nome, String descricao) {
        super(nome, descricao);
        musicas = new ArrayList<Musica>();
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public int getQuantidadeMusicas() {
        return quantidadeMusicas;
    }
}
