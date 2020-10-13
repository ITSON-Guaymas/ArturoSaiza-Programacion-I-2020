
package myif;

import java.util.Scanner;


public class IfConVariables {

 
    public static void main(String[] args) {
      
      boolean t= true;
      Scanner leer = new Scanner (System.in);
      
    //  t = leer.nextBoolean();
      
      if(t){
          System.out.println("T es  Verdaredo");
      }else{
          System.out.println("T es Falsa");
      }
      
      
      
      int n1, n2;
      
        System.out.println("ingresa numero 1: ");
        n1= leer.nextInt();
        System.out.println("ingresa numero 2: ");
        n2 = leer.nextInt();
        
        if(n1>n2){
            System.out.println(n1+" es mayor que "+n2);
        }else{
             System.out.println(n1+" es menor o igual que "+n2);
        }
        System.out.println("Escribe tu nombre");
        String nombre = leer.next();
        System.out.println(nombre);
        
        if(!nombre.equals("Jesus")){
            System.out.println("Pase usted");
        }else{
            System.out.println("Lo siento, nos e adminten Jesus");
        }
        
        
        
        
        
    }
    
}
