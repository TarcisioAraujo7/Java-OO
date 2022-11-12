import java.util.Objects;

public class Sessao {

    private Jogador playerLogado;

    private final String nickDefinido = "terra";
    private final String senhaDefinida = "2022";


    public void login(String nome, String senha){

        if (Objects.equals(nickDefinido, nome) && Objects.equals(senhaDefinida, senha)) {
            playerLogado = new Jogador();
        }
    }


    public Jogador getPlayerLogado() {
        return playerLogado;
    }


}
