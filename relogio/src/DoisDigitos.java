public class DoisDigitos {
	private int limite;
	private int valor_atual;
	
	public DoisDigitos(int pLimite) {
		limite = pLimite;
		valor_atual = 0;
		
	}
	
	public int getValor() {
		return valor_atual;
	}
	
	public void setValor(int pValor) {
		if((pValor >= 0) && pValor < limite) {
			valor_atual = pValor;
		}
		
	}
	public int getLimite() {
		return limite;
	}
	
	public void incremento() {
		valor_atual = (valor_atual + 1) % limite;
	}
	
	public String getValorParaMostrar () {
		if (valor_atual < 10) {
			return "0" + valor_atual;
		}
		else return "" + valor_atual;
	}
}