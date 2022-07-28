public class RelogioDigital {
	private DoisDigitos horas;
	private DoisDigitos minutos;
	private String tela;
	
	public RelogioDigital() {
		horas = new DoisDigitos(24);
		minutos = new DoisDigitos(60);
		atualizarTela();

	}
	
	public RelogioDigital(int hora_esp, int min_esp) {
		horas = new DoisDigitos(24);
		minutos = new DoisDigitos(60);
		setTempo(hora_esp, min_esp);
	}
	
	public void setTempo(int phora, int pmin) {
		horas.setValor(phora);
		minutos.setValor(pmin);
		atualizarTela();

	}
	
	public void tempoTic() {
		minutos.incremento();
		if (minutos.getValor() == 0 ) {
			horas.incremento();
		}
		atualizarTela();
	}
	
	public void atualizarTela() {
		tela = horas.getValorParaMostrar() + ":" + minutos.getValorParaMostrar();							
	}
	
	public String getTempo() {
		return tela;
	}
}
