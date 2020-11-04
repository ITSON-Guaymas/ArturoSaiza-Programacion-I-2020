
package MyArray;


public class PizzaArray {

   
    public static void main(String[] args) {
    String [] pizzas = new String[10]; 
    
    pizzas[0]="Mexicana";
    pizzas[1]="3 Carnes";
    pizzas[6]="hawaiana";
        System.out.println("---------------------");
        System.out.println(pizzas[1]);
        System.out.println(pizzas[6]);
        
    for(int i=0; i<pizzas.length; i++){
        System.out.println(i+": "+pizzas[i]);
    }
        
    }
    
}
