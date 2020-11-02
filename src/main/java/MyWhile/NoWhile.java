
package MyWhile;

import java.util.Scanner;

 
public class NoWhile {

     
    public static void main(String[] args) {
        
       String sueno= "si";
    Scanner  leer = new Scanner(System.in);
     
        while(!sueno.equals("si")){
            System.out.println("Tienes sueño?");
            sueno = leer.nextLine();
            if( sueno.equals("si") ){
                System.out.println("Duermete");
            }
        }
        
        
        System.out.println("Fin while");
     
        
       
    }
    
}
