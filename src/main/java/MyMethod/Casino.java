
package MyMethod;

import java.util.Scanner;


public class Casino {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos años tienes?");
        int edad = leer.nextInt(); leer.nextLine();
        boolean mayorEdad = verificarEdad(edad);
        
        if(mayorEdad){
             System.out.println("Ingresa a todas las funciones del sistema!!!");
        }else{
            System.out.println("No puedes entrar!");
        }
        
        
    }
    
    public static boolean verificarEdad(int edad){
        if(edad >= 18){
            System.out.println("Acceso Autorizado!!");
            return true;
        }else{
            System.out.println("Acceso denegado");
            return false;
        }
    
    }
    
    
    
}
