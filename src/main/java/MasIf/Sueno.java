package MasIf;

import java.util.Scanner;

public class Sueno {

    public static void main(String[] args) {
      
     String sueno;
     Scanner leer = new Scanner(System.in);
     
    System.out.println("Tienes sueño? Si o No");
    sueno = leer.next();
    
    if(sueno.equalsIgnoreCase("Si")){
        System.out.println("Vete a Domir");
    }
    
        System.out.println("Fin Algoritmo");
        
        
    }
    
}
