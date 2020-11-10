
package MyMethod;

import java.util.Scanner;


public class Promedio {


    public static void main(String[] args) {  
     Scanner leer = new Scanner(System.in);   
     
      double matematicasP1 =8;
      double matematicasP2 =9;
      double matematicasP3 =7;      
      double promedioMatematicas = promediar(matematicasP1,matematicasP2, matematicasP3,"Matematicas");
      
      double insofP1 =6.5;
      double insofP2 =9.5;
      double insofP3 =4.0;      
      double promedioInsoft = promediar(insofP1,insofP2, insofP3,"Ingenieria en Software");
      
      double InglesP1=8;
      double InglesP2=10;
      double InglesP3=9;
      
      double promedioIngles = promediar(InglesP1,InglesP2,InglesP3,"Ingles I");
      
      
    promediar(promedioMatematicas,promedioInsoft,promedioIngles,"Calificacion Final");
        
    }
    
    
    public static double promediar(double v1, double v2, double v3,String nombreMateria){
     double total = (v1+v2+v3)/3;   
     System.out.println("---------------------"); 
     System.out.println(nombreMateria);
     System.out.println("Promedio: "+total); 
     return total; 
    }
    
}
