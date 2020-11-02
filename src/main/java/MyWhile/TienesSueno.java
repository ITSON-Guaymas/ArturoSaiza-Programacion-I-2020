 
package MyWhile;
 
import java.util.Scanner;

public class TienesSueno {
 
    public static void main(String[] args) {
    String sueno= "no";
    Scanner  leer = new Scanner(System.in);
    //  sueno != "si"
        while(!sueno.equals("si")){
            System.out.println("Tienes sueño?");
            sueno = leer.nextLine();
            if( sueno.equals("si") ){
                System.out.println("Duermete");
            }
        }
    
    
    
        
    }
    
}
