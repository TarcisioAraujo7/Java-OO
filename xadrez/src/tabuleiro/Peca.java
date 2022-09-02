package tabuleiro;

public class Peca{
    protected Posicao pos;
    private Tabuleiro tab;

    public Peca(Tabuleiro tab){
        this.tab = tab;
        pos = null;
    }

    public Posicao getPos() {
        return pos;
    }

    public void setPos(Posicao pos) {
        this.pos = pos;
    }

    protected Tabuleiro getTab() {
        return tab;
    }

    
}