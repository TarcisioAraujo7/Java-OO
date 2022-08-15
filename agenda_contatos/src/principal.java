public class principal {
	public static void main(String[] args) {
		
		Contato contato1 = new Contato("Alicia","79 911111111");
		Contato contato2 = new Contato("Tarcisio","79 922222222");
		
		Agenda agenda1 = new Agenda();
		
		agenda1.addContato(contato1);
		agenda1.addContato(contato2);
		
		agenda1.mostrarContatos();
		
		agenda1.removeContato(contato2);
		
		agenda1.mostrarContatos();

		agenda1.removeContato(contato1);
		
		agenda1.mostrarContatos();
	}

}
