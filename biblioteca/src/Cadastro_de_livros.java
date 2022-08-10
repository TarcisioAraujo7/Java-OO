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
                               "[4] Consultar um ator.\n"  +  //fazer pra ebook
                               "[0] Sair do programa.");
            
            opcao = scan.nextInt();

            if (opcao == 1) {

                System.out.println("Voce deseja adicionar um:");
                System.out.println("[1] Livro fisico.\n" +
                                   "[2] Ebook.");
                Integer escolha = scan.nextInt();
                scan.nextLine();

                if(escolha == 1){
                    System.out.println("Insira o nome do autor do livro:");
                    String nome_autor = scan.nextLine();    
                    reg.novoLivro(new LivroFisico(new Autor(nome_autor)), scan);   //dar um jeito de ver se ja tem um autor desses

                } if (escolha == 2) {
                    System.out.println("Insira o nome do autor do ebook:");
                    String nome_autor = scan.nextLine();
                    reg.novoLivro(new Ebook(new Autor(nome_autor)), scan);
                } else{
                    System.out.println("Insira um valor valido!");
                    continue;
                }

            } else if (opcao == 2) {
                System.out.println("Insira o nome do autor:");
                String nome_autor = scan.nextLine();
                reg.novoAutor(new Autor(nome_autor), scan);

            } else if (opcao == 3){
                System.out.println("Insira o nome do livro que voce deseja consultar:");
                String nome_consultado = scan.nextLine();
                
            }
        }
        scan.close();
    }
}
