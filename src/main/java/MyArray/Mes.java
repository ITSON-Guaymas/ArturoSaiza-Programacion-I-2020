 
package MyArray;

import java.util.Scanner;

 
public class Mes {
 
    public static void main(String[] args) {
         
        String [] meses ={"Enero","Febrero","Marzo","Abril","Mayo","Junio","julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
         Scanner leer= new Scanner(System.in);
         int nomes= leer.nextInt();
         System.out.println(meses[nomes-1]);
    }
    
}
