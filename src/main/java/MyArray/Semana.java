 
package MyArray;

import java.util.Scanner;

 
public class Semana {
 
    public static void main(String[] args) {
         String [] semana2 = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};   
        String [] semana = new String[7];         
         semana[0]="Lunes";
         semana[1]="Martes";
         semana[2]="Miercoles";
         semana[3]="Jueves";
         semana[4]="Viernes";
         semana[5]="Sabado";
         semana[6]="Domingo"; 
         
         Scanner leer= new Scanner(System.in);
         int diaSemana=0;
         
         System.out.println("Ingresa un dia de la semana");
         System.out.println("Lunes (1), Martes(2), Miercoles(3), Jueves(4), Viernes(5), Sabado(6), Domingo)(7)");
         diaSemana = leer.nextInt();
         System.out.println(semana[diaSemana-1]);
    }
    
}
