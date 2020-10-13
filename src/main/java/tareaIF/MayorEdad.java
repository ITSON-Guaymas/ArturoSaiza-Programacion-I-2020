
package tareaIF;

import java.util.Scanner;

public class MayorEdad {

    public static void main(String[] args) {
        
     String nombre; 
     int mayorEdad;
     Scanner leer = new Scanner(System.in);
     
        System.out.println("Ingresa tu edad");
     mayorEdad = leer.nextInt();
     
        System.out.println("Ingresa tu nombre");
     nombre = leer.next();
       System.out.println( );
       System.out.println( );
     
     if(mayorEdad >= 18){
         System.out.println("Hola "+nombre);
         System.out.println("Tienes "+mayorEdad+" años");
         System.out.println("Eres mayor de edad");
     }else{
         System.out.println("Hola "+nombre);
         System.out.println("Tienes "+mayorEdad+" años");
         System.out.println("Eres menor de edad"); 
     }
     
     
     
    }
    
}
