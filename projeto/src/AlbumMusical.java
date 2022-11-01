import java.util.ArrayList;
import java.util.List;

public class AlbumMusical extends Produto {

    private List<Musica> musicas = new ArrayList<Musica>();

    public AlbumMusical(String nome, String descricao) {

        super(nome, descricao);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }


}
