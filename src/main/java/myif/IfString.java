
package myif;

import java.util.Scanner;

public class IfString {

    public static void main(String[] args) {
       String nombre1 = "Jesus"; //nombre1 = Ox000000898998 = jesus
       String nombre2 =  nombre1;  //nombre2 = Ox000000898998 = jesus
       
      if(nombre1 == nombre2){ // porque  Ox000000898998 == Ox000000898998
          System.out.println("Son iguales");
      }else{
          System.out.println("Son iguales");
      }
      Scanner leer = new Scanner(System.in);
       
      
      if(nombre1==leer.next()){ // Ox000000898998 No es igual Ox00000435345
           System.out.println("Son iguales");
      }else{
           System.out.println("No son iguales");
      }     
      
      if(nombre1.equals( leer.next() )){ //Jesus == Jesus
         System.out.println("Son iguales");
      }else{
             System.out.println("No son iguales");
      }
      
      
        
    }
    
}
