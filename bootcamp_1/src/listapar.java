// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
 
public class listapar{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var count = 0;

        for (var i = 1; i <= num; i++)
        {
            var strNum = String.valueOf(i);

            char[] vs = strNum.toCharArray();
            var sum = 0;

            if (strNum.length() >=   1   )
            {
                for (char numero : vs) {
                    sum += Character.getNumericValue(numero);
                }
                if (sum % 2 == 0) {
                    count += 1;
                }
                
            } else {
                if (i % 2 == 0) {
                    count += 1;
                }
            }
            

            
            

            
        }
        System.out.println(  count   );
    }
}