public class Alunoo {

    public String nome;
    public Double nota1;
    public Double nota2;
    public Double nota3;

    public Double notaFinal() {
         return nota1 + nota2 + nota3;
    }

    public void aprovacao(){
        if (notaFinal()>= 60){
            System.out.println("PASS");
        }else System.out.printf("FAILED%nMISSING " + (60 - notaFinal()));
        //System.out.println("MISSING " + (60 - notaFinal()));

              
    }
}
