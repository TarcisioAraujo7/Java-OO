
public class Sessao extends viewLogin{

    private Jogador playerLogado;
    private Jogo jogoAtual;


    public void login(){

        playerLogado = new Jogador();
        
    }

    public Jogo getJogoAtual() {
        return jogoAtual;
    }

    public Jogador getPlayerLogado() {
        return playerLogado;
    }


}
