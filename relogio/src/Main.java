public class Main {

	public static void main(String[] args) {
		RelogioDigital relogio1 = new RelogioDigital();
		String telaString = relogio1.getTempo();
		System.out.println(telaString);
		relogio1.tempoTic();
		System.out.println(telaString);
	}

}