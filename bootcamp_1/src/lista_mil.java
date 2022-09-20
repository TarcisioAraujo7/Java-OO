// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class lista_mil {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
   
// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int auxiliar = 0;
        for(int i = 0 ; i<1000  ; ++i ){
        
        System.out.println("N[" + i + "] = " + auxiliar);
        auxiliar = auxiliar + 1;

        if (auxiliar == t) {
            auxiliar = 0;
        }


        
    }
}
}