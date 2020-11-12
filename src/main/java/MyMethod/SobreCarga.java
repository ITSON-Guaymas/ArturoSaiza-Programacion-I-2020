
package MyMethod;


public class SobreCarga {

   
    public static void main(String[] args) { 
        miMetodo(5,7); 
        miMetodo( ); 
        miMetodo(7);    
        miMetodo("Gato");
        System.out.println();
    }
    
    public static void miMetodo(){
        System.out.println("1. Estoy en miMetodo");
    }
    
    public static void miMetodo(int x){
        System.out.println("2. Estoy en miMetodo con x: "+x);
    } 
    
    public static void miMetodo(int x, int y){ // cantidad  de parametros
        System.out.println("3. Estoy en miMetodo con X y Y : "+x);
    }
    
    public static void miMetodo(String x){ //tipo de dato del parametro
        System.out.println("4. Estoy en miMetodo con x String: "+x);
    }    
    
  /*  public static int miMetodo(String x){ //tipo de dato del parametro
        System.out.println("4. Estoy en miMetodo con x String: "+x);
       return 4;
    } */
    //no se puede   
    
}
