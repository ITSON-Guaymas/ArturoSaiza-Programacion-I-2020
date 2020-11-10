
package MyMethod;

import java.util.Scanner;

public class Saludo {

    public static void main(String[] args) {
      String nombre;
      Scanner leer = new Scanner(System.in);
      
      for(int i=0; i<5; i++){
        System.out.println("Ingresa un nombre:");
        nombre = leer.nextLine();      
        saludar(nombre);
      }
    }
    
    public static void saludar(String nombre){ 
        System.out.println("Hola "+nombre);
    }
    
}
