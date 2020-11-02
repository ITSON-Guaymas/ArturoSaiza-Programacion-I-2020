 
package MyArray;
 
import java.util.Scanner;

public class Futbol {
  
    public static void main(String[] args) {
       String [] barcelona = {  "Messi","Griesman","Djhon", "Pique" };
       String [] juventus = {"Cristiano","El bicho","Ludo","elPepe"};
       int[] minuto =  new int [100];
       int[] jugadores = new int [100]; 
       int[] equipo =  new int [100];
       
       Scanner  leer = new Scanner(System.in);
       int i=0;
       int minutoFinal=0;
       do{
           
           System.out.println("Que minuto es?");
           minuto[i]= leer.nextInt();
           minutoFinal = minuto[i];
           System.out.println("Que equipo metio gol?");
           equipo[i]= leer.nextInt();
           System.out.println("Que jugador metio gol?");
           jugadores[i] = leer.nextInt();
       i++;
       }while( minutoFinal != 90);
       
       for(int e=0; e<minuto.length; e++){
          String equipoFinal="";
            if(equipo[e]==1){
                equipoFinal="Barcelona";
            }else{
                equipoFinal="Juventus";
            }
            String jugador="";
            if(equipo[e]==1){
                jugador=barcelona[jugadores[e]];
            }else{
                jugador=juventus[jugadores[e]];
            } 
           System.out.println("\n--------------------------");
           System.out.println("Gol de "+equipoFinal);
           System.out.println("Anotado por "+jugador);
           System.out.println("En el minuto "+minuto[e]);
           
       }
       
        System.out.println("FIN PARTIDO");
       
        
       
       
        
    }
    
}
