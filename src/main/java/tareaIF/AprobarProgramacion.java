
package tareaIF;

import java.util.Scanner;

public class AprobarProgramacion {

  
    public static void main(String[] args) {
     int calificacion;
     Scanner ingresarDato = new Scanner(System.in);        
       
     System.out.println("Ingresa tu calificacion de programacion") ;
       
        calificacion= ingresarDato.nextInt();
        
        if (calificacion>=7) {          
        System.out.println("estoy aprobado") ;      
        } else{ 
        System.out.println("estoy reprobado") ;        
         }   
        
        
    }
    
}
