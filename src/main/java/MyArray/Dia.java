
package MyArray;

import java.util.Scanner;

public class Dia {

 
    public static void main(String[] args) {
      String [] dias = new String[7];
      Scanner leer = new Scanner(System.in);
      dias[0]="Lunes";
      dias[1]="Martes";
      dias[2]="Miercoles";
      dias[3]="Jueves";
      dias[4]="Viernes";
      dias[5]="Sabado";
      dias[6]="Domingo";
      
      System.out.println("Ingresa un numero de la semana");
      System.out.println(dias[leer.nextInt()-1]);
    }
    
}
