import javax.swing.JOptionPane;

public class Jogador {

    private String nome;
    private int conquistas;
    private float saldoTotal;

    public Jogador(String nome){
        conquistas = 0;
        saldoTotal = 50;
        this.nome = nome;
    }

    public boolean comprarJogo(Jogo jogo){
        if (saldoTotal >= jogo.getPreco()) {
            jogo.setPossui(true);
            saldoTotal -= jogo.getPreco();
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente!", "Solar",JOptionPane.ERROR_MESSAGE);
            return false;       
        }
    }

    public String getNome() {
        return nome;
    }

    public int getConquistas() {
        return conquistas;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

}