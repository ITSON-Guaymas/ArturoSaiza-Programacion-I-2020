package MasIf;

import java.util.Scanner;

public class Novia {
   
    public static void main(String[] args) {
       
     boolean tienesNovia;     
     Scanner leer =   new Scanner(System.in);
     
     System.out.println("Tienes Novio(a)? True False");
      
     tienesNovia = leer.nextBoolean();
     
     if(tienesNovia){
         System.out.println("Que bien (Te felicito)");
         System.out.println("Como se llama?");
         String nombreNovia = leer.next();
         System.out.println(nombreNovia+" es un bonito nombre <3 ");
     }else{
         System.out.println("Que mal "); 
         System.out.println("Eso te pasa por feo");
     }
     
        
        
    }
    
}
