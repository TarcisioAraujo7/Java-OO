package tabuleiro;

public class Tabuleiro {
    private int colunas;
    private int linhas;
    private Peca [][] pecas;

    public Tabuleiro(int colunas, int linhas) {
        this.colunas = colunas;
        this.linhas = linhas;
        pecas = new Peca[linhas][colunas];
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    } 
    
    
}
