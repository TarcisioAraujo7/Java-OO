import java.util.List;

public class Biblioteca {

    private Loja loja = new Loja();
    Sessao sessaoAtual;

    public Biblioteca(){
        Jogo doom = new Jogo("Doom", "Jogo de ação e aventura");
        doom.setConquista("Primeiro chefão derrotado!", "Parabens! Você derrotou o primeiro BOSS.", 15);
        doom.setConquista("Metade do jogo concluido!", "Parabens! Você chegou na metade do jogo.", 50);
        doom.setConquista("JOGO FINALIZADO!", "Parabens! Você derrotou o BOSS final e zerou o jogo.", 100);

        loja.addJogo(doom);

        AlbumMusical albumDoom = new AlbumMusical("Album Doom", "Album do jogo Doom");
        albumDoom.setMusica("The Only Thing They Fear Is You");
        albumDoom.setMusica("BFG Division");
        albumDoom.setMusica("Metahook");

        loja.addAlbum(albumDoom);

        sessaoAtual = new Sessao();

        sessaoAtual.getPlayerAtual.comprarJogo(doom);
    }
}
