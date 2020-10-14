
package MySwitch.TareaIf;

import java.util.Scanner;


public class NumeroMasGrande {


    public static void main(String[] args) {
    int num1, num2;  
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa el primer numero");
       num1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = leer.nextInt();
        
        if(num1 > num2){
            System.out.println(num1+" es mayor que "+num2);
        }else{
            System.out.println(num2+" es mayor que "+num1); 
        }
        
    }
    
}
