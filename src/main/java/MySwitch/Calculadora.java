
package MySwitch;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
       
        String opcion;
        double n1;
        double n2;
        double resultado=0;
        Scanner leer = new Scanner(System.in);        
        
        System.out.println("----------- CALCULADORA----------");
        System.out.println("Ingresa  una opcion");
        System.out.println("Sumar(S), Restar(R), Multiplicar(M), Dividir(D)");
        opcion = leer.next();

        System.out.println("Ingresa el primer numero");
        n1 = leer.nextDouble();

        System.out.println("Ingresa el segundo numero");
        n2 = leer.nextDouble();
        
        switch(opcion){
            case "S": resultado = n1+n2; break;
            case "R": resultado = n1-n2; break;
            case "M": resultado = n1*n2; break;
            case "D": resultado = n1/n2; break; 
            default : System.out.println("Esa opcion no existe"); break;
        }
        
        System.out.println("Total: "+resultado);
        
        
        
        
    }
    
}
