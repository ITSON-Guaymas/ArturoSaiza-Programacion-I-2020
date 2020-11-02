
package MyWhile;

import java.util.Scanner;


public class MyDoWhile {

    public static void main(String[] args) {
       
    String sueno;
    Scanner  leer = new Scanner(System.in);
         
       do{
            System.out.println("Tienes sueño?");
            sueno = leer.nextLine();
            if( sueno.equals("si") ){
                System.out.println("Duermete");
            }
       }while(!sueno.equals("si"));
         
        
        
        
    }
    
}
