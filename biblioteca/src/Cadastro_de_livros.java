import java.util.Scanner;

public class Cadastro_de_livros {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Registro reg = new Registro();
        int opcao = 1;

        while(opcao != 0){
            
            System.out.println("----------------------------------------");
            System.out.println("- Seja bem vindo a biblioteca central! -");
            System.out.println("----------------------------------------");
            System.out.println("-Digite a opcao desejada");
            System.out.println("[1] Cadastrar um livro.\n" +
                               "[2] Cadastrar um autor.\n" +
                               "[3] Consultar um livro.\n" +
                               "[4] Consultar um ator.\n"  +
                               "[5] Aplicar desconto.\n"   +
                               "[6] Realizar compra.\n"    +
                               "[0] Sair do programa.");

            
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Voce deseja adicionar um:");
                    System.out.println("[1] Livro fisico.\n" +
                                       "[2] Ebook.");
                    Integer escolha = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Insira o nome do autor do livro:");
                    String nome_autor = scan.nextLine();

                    if(reg.temAutor(nome_autor)){
                        
                        Autor autor_existente = reg.getAutor(nome_autor);

                        if(escolha == 1){
                        reg.novoLivro(new LivroFisico(autor_existente), scan);   

                        } else if (escolha == 2) {
                        reg.novoLivro(new Ebook(autor_existente), scan);

                        } else {
                        System.out.println("Insira um valor valido!");
                        continue; }
                    } else {
                        
                        Autor autorx = new Autor(nome_autor);

                        reg.novoAutor(autorx, scan);

                        if(escolha == 1){
                        reg.novoLivro(new LivroFisico(autorx), scan);   

                        } else if (escolha == 2) {
                        reg.novoLivro(new Ebook(autorx), scan);
        
                        } else {
                        System.out.println("Insira um valor valido!");
                        continue;}
                    } 
                    break;
                case 2:
                    System.out.println("Insira o nome do autor:");
                    String nome_autor2 = scan.nextLine();
                    reg.novoAutor(new Autor(nome_autor2), scan);
                    break;
                case 3:
                    System.out.println("Insira o nome do livro que voce deseja consultar:");
                    scan.nextLine();
                    String nome_consultado = scan.nextLine();
                
                    if (reg.getLivro(nome_consultado) != null) {
                        reg.getLivro(nome_consultado).mostrarDados();
                    } else{
                        System.out.println("Livro nao consta no sistema.");
                    }
                    break;
                case 4:
                    System.out.println("Insira o nome do autor:");
                    scan.nextLine();
                    String nome_autor3 = scan.nextLine();

                    if (reg.getAutor(nome_autor3) != null) {
                        reg.getAutor(nome_autor3).mostrarAutor();
                    } else{
                        System.out.println("Autor nao consta no sistema.");
                    }
                    break;
                case 5:
                System.out.println("Qual livro deseja aplicar desconto?");
                scan.nextLine();
                String livroDesconto = scan.nextLine();
                Livro livro_desconto = reg.getLivro(livroDesconto);
                
                if (livro_desconto != null){
                    System.out.println("Quantos % de desconto deseja aplicar?");
                    Double desconto = scan.nextDouble();
                    livro_desconto.aplicaDesconto(desconto/100);
                } else {
                    System.out.println("Este livro não existe no banco de dados.");
                }
                default:
                    System.out.println("Insira um numero valido.");
                


            }
           
        
    }
    scan.close();
    }
}