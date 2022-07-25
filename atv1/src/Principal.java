import java.util.Scanner;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Alunoo Aluno1 = new Alunoo();

        Aluno1.nome = sc.nextLine();
        Aluno1.nota1 = sc.nextDouble();
        Aluno1.nota2 = sc.nextDouble();
        Aluno1.nota3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + ( Aluno1.notaFinal()));
        Aluno1.aprovacao();
        sc.close();
    }

}
