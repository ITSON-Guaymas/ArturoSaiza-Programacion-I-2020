 
package MyFor;
 
public class Numeros {
          
    public static void main(String[] args){
        
        System.out.println("\n for del 1 al 10");
           
        for(int i=0; i<=10; i++ ){  // i=i+1
            System.out.println(i);
        }        
        System.out.println("fin for del 1 al 10"); 
        
         
        System.out.println("\n del 10 al 100 de 5 en 5");
        for(int i=10; i<=100;i=i+5){
            System.out.println(i);
        }
        
        System.out.println("\n del 25 al 4 de 1 en 1");
        for(int e=25; e>=4; e--){
            System.out.println(e);
        }
        
        System.out.println("\n del -33 al 33 de 3 en 3");
        for(int n=-33; n<=33; n=n+3){
            System.out.println(n);
        }
    
    
    }
    
}
