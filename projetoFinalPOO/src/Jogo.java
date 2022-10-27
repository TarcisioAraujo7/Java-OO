import java.util.List;

public class Jogo extends Produto {

    private int Progresso = 0;
    private List<Conquista> conquistas = new Arraylist<Conquista>();

    public Jogo(String nome, String descricao) {
        super(nome, descricao);
    }
    
    public void Jogar(int horasJogadas){
        if (Progresso <= 100) {
            Progresso += horasJogadas;
        }
    }
}
