
package leer;

import java.util.Scanner;

public class Sumar {
   
    public static void main(String[] args) {    
        
        int numero1, numero2, total; 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        numero1= leer.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        numero2 = leer.nextInt();
        total = numero1 + numero2;        
        System.out.println("la suma es: "+total);
        
    }
    
}
