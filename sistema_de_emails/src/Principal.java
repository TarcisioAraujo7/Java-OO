
public class Principal {
	public static void main(String[] args) {
		ServidorEmail servidor;
        ClienteEmail cliente1;
        ClienteEmail cliente2;
        ClienteEmail cliente3;
        ClienteEmail cliente4;
        ClienteEmail cliente5;
        
        servidor = new ServidorEmail();
    
        cliente1 = new ClienteEmail( servidor, "cliente1" );
        cliente2 = new ClienteEmail( servidor, "cliente2" );
        cliente3 = new ClienteEmail( servidor, "cliente2" );
        cliente4 = new ClienteEmail( servidor, "cliente4" );
        cliente5 = new ClienteEmail( servidor, "cliente5" );
        
        // cliente1
        cliente1.enviarEmail("cliente2", "mensagem de cliente1 para cliente2");
        cliente1.enviarEmail("cliente2", "mensagem 2 de cliente1 para cliente2");
        cliente1.enviarEmail("cliente3", "mensagem de cliente1 para cliente3");
        cliente1.enviarEmail("cliente4", "mensagem de cliente1 para cliente4");
        cliente1.enviarEmail("cliente5", "mensagem de cliente1 para cliente5");
        
        // cliente2
        cliente2.enviarEmail("cliente1", "mensagem do cliente 2 para o cliente1");
        cliente2.enviarEmail("cliente3", "mensagem do cliente 2 para o cliente3");
        cliente2.enviarEmail("cliente4", "mensagem do cliente 2 para o cliente4");
        
        // cliente3
        cliente3.enviarEmail("cliente1", "mensagem do cliente 3 para o cliente1");
        cliente3.enviarEmail("cliente2", "mensagem do cliente 3 para o cliente2");
        cliente3.enviarEmail("cliente4", "mensagem do cliente 3 para o cliente4");        
        cliente3.enviarEmail("cliente5", "mensagem do cliente 3 para o cliente5");
        cliente3.enviarEmail("cliente1", "mensagem 2 do cliente 3 para o cliente1");        
        cliente3.enviarEmail("cliente2", "mensagem 2 do cliente 3 para o cliente2");
        cliente3.enviarEmail("cliente4", "mensagem 2 do cliente 3 para o cliente4");        
        cliente3.enviarEmail("cliente5", "mensagem 2 do cliente 3 para o cliente5");
        
        // cliente4
        cliente4.enviarEmail("cliente1", "mensagem do cliente 4 para o cliente1");
        cliente4.enviarEmail("cliente1", "mensagem do cliente 4 para o cliente2");
        
        // cliente5
        cliente5.enviarEmail("cliente1", "mensagem do cliente 5 para o cliente1");
        
        cliente1.mostrarEmails();
        cliente2.mostrarEmails();
        cliente3.mostrarEmails();
        cliente4.mostrarEmails();
        cliente5.mostrarEmails();

    
	}

}

