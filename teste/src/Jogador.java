import java.util.ArrayList;
import java.util.List;


public class Jogador {

    private List<Jogo> jogosPessoais;
    private List<AlbumMusical> albunsPessoais;
    private int conquistas;
    private float saldoTotal;

    public Jogador(){
        jogosPessoais = new ArrayList<Jogo>();
        albunsPessoais = new ArrayList<AlbumMusical>();
        conquistas = 0;
        saldoTotal = 0;
    }

    public void comprarJogo(Jogo jogo){
        if (saldoTotal >= jogo.getPreco()) {
            jogosPessoais.add(jogo);
            saldoTotal -= jogo.getPreco();
        } else {
            System.out.println("Saldo invalido");
        }
    }

    public void jogarJogo(Jogo jogo, int horasJogadas){
        if (saldoTotal >= jogo.getPreco()) {
            jogosPessoais.add(jogo);
            saldoTotal -= jogo.getPreco();
        } else {
            System.out.println("Saldo invalido");
        }
    }


    public List<Jogo> getJogosPessoais() {
        return jogosPessoais;
    }

    public List<AlbumMusical> getAlbunsPessoais() {
        return albunsPessoais;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

}