 
package itson;
 
public class MyInteger {
 
    public static void main(String[] args) {
        
        int numero = 5; // se pueden guaradr numeros positivos
        
        int numero2 = -5; // se pueden guardar numeros negativos
       // int numero3 = "10";  en un int nos e pueden guardar string
        //int numero4 = 4.5; // en un int no se pueden guardar decimales
        int numero0 = 0;
  
        int total= numero + 10;
        
       // System.out.println("el total es: "+total);
        
       // CONTADORES
       
       
        int contador= 0;
        contador = contador+1; // 0+1=1
        contador = contador+1; // 1+1=2
        contador = contador+1; // 2+1=3
        contador = contador+1; // 3+1=4
        contador = contador+1; // 4+1=5    
         
        System.out.println("contador : "+contador);        
        
         contador++; // 5+1=6
         contador++; // 6 +1 =7
         contador++;//7+1=8
         contador++;//8+1 =9
         contador++; //9+1 =10
         System.out.println("contador : "+contador); 
         
        contador --;
        contador --;
        contador --;
        contador --;
        contador --;
        contador --;
        contador --;
        contador --;
        contador --;
        contador --;
        System.out.println("contador : "+contador); 
        
        int numero10= 45;
        numero10++;
        numero10++;
        numero10--;
        numero10++;
        
        System.out.println(numero10++);
        
        
        //Acumulador
        int edades=18;
        edades = edades +17;
        edades = edades + 20;
        edades = edades + 20;
        edades+= 20;
        edades += 21;
        edades+=19;
        edades += 18;
        
        System.out.println("La suma de todas las edades es: "+edades);
        System.out.println("El promedio de edades es "+(edades/8));
        
        
        int alcancia =100;
        
        alcancia= alcancia-10;
        
        alcancia = alcancia -20;
        
        alcancia-= 5;
        
        alcancia -= 10;
        
        System.out.println("Me quedan "+alcancia+" en la alcancia" );
        
        int numeror=5;
        numero = numero *5;
        
        numero*= 5;
        numero/= 5;
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
