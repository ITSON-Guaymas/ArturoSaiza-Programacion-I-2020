package leer;

import java.util.Scanner;


public class Leer {

  
    public static void main(String[] args) {
    
     Scanner  leer; 
     leer =  new Scanner(System.in);
     
      System.out.println("Escribe tu nombre");
      String nombre = leer.nextLine();
      int edad = leer.nextInt();
       
      
       System.out.println("Hola "+nombre);
       System.out.println("tienes "+edad);
     
        
        
    }
    
}
