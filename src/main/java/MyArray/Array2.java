 
package MyArray;
 
public class Array2 {
 
    public static void main(String[] args) {
       String [] frutas =  new String[1000];
       frutas[5]="Manzana";
       frutas[25]="Pera";
       frutas[70]="Durazno";
       frutas[101]="Fresa";
       
      for(int i=0; i<frutas.length; i++){
          if(frutas[i]!=null){
                System.out.println(i+" - "+frutas[i]);
          }
        
      }
    }
    
}
