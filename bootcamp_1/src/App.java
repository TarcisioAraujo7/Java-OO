import java.util.Scanner;


public class App {
    public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      String entrada = scan.nextLine();

      String entradaFormatada = entrada.replaceAll(" ", "");
      
      String[] lista = entradaFormatada.split(",");

      scan.close();
      for (String string : lista) {
        Integer numero = Integer.parseInt(string);
        if(numero % 2 == 0 )
          System.out.println(numero);
      }
    
}
}