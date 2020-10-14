 
package MySwitch.TareaIf;

import java.util.Scanner;

 
public class Sandwich {
 
    public static void main(String[] args) {
        
        String hambre;
        Scanner leer = new Scanner(System.in); 
      
        System.out.println("Tienes hambre?");
        hambre = leer.next();


        if(hambre.equalsIgnoreCase("Si")){
            System.out.println("Comete un Sandwich");
        }
        
    }
    
}
