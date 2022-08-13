
import java.util.List;
import java.util.ArrayList;


public class Agenda {
	private List<Contato> agenda = new ArrayList<Contato>();
	
	public void addContato(Contato contato) {
		agenda.add(contato);
	}
	
	public void removeContato(Contato contato) {
		agenda.remove(contato);
	
	}
	
	public void mostrarContatos() {
		Integer comprimento = agenda.size();
		
		if(comprimento == 0) {
			System.out.println("A sua agenda esta vazia!");
			
		} else if(comprimento == 1) {
			System.out.println("Mostrando 1 contato.");
			System.out.println("--------------------------");

		} else {
			System.out.println("Mostrando " + comprimento + " contatos.");
			System.out.println("--------------------------");
		}
			
		for(Integer i = 0; i != comprimento; i++) {
			Contato contatoAtual = agenda.get(i);
			contatoAtual.mostrarContato();
		}
	}
}
