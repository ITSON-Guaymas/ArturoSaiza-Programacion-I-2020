 
package MyMethod;
 
import java.util.Scanner;

public class Calculadora {
 
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        
        double numero1= leer.nextDouble();
        double numero2= leer.nextDouble(); 
        sumar(numero1,numero2); 
        restar(numero1,numero2);
        
    }
    
    public static void sumar(  double n1,  double n2){
     double total = n1+n2;
     System.out.println(total);
    }
    
    public static void restar( double n1,double n2){
    //double n1=8;
    //double n2=6; 
    double total = n1-n2;
        System.out.println(total);
    }
    
    
}
