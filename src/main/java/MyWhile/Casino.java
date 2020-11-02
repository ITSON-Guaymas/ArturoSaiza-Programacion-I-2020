
package MyWhile;

import java.util.Scanner;


public class Casino {

    public static void main(String[] args) {
           
    String menu="";
    Scanner leer= new Scanner(System.in);
    
    do{
        System.out.println("\n\n--------MENU Caliente MX ----------");
        System.out.println("Apostar(a), Sala bingo(b), Maquinitas(m), Comerdor(C), salir(x)");
        menu = leer.nextLine(); 
        
        switch(menu){
            case "a": System.out.println("SALA DE APUESTAS"); break;
            case "b": 
                
                System.out.println("------ SALA DE BINGO ------- \n ingresa el numero ganador"); 
                int numGanador = leer.nextInt();
                int numAleatorio;
               do{
                    numAleatorio= (int) (Math.random()*10+1);
                   
                    System.out.println("Numero ganador: "+numGanador);
                    System.out.println("Numero Aleatorio: "+numAleatorio);
                    if(numAleatorio== numGanador){
                        System.out.println("Felicidades, Eres el ganador!");
                    }else{
                        System.out.println("Perdiste");
                    }
               
               } while(numAleatorio != numGanador );
                
                
                break;
            case "m": System.out.println("SALA DE MAQUINITAS"); break;
            case "c":
                System.out.println("------Comedor-------"); 
                System.out.println("Que quiere comer?");
                String comida= leer.nextLine();
                System.out.println("Su platillo: "+comida+" sale en 30 minutos");
                System.out.println("Quiere algo de tomar? Si, No");
                String tomar = leer.nextLine();
                if(tomar.equalsIgnoreCase("Si")){
                    System.out.println("Que quieres tomar?");
                    tomar = leer.nextLine();
                    System.out.println("Para tomar elegiste "+tomar);
                }else{
                     System.out.println("Ok (=");   
                }
               
                break;
            case "x": System.out.println("Saliendo"); break;
            default:  System.out.println("La opcion elegida no existe"); break;
        } 
                
    }while(!menu.equalsIgnoreCase("x"));
    
        System.out.println("Fin del sistema"); 
        
    }
    
}
