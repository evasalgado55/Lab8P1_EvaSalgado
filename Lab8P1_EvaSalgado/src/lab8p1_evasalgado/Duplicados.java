
package lab8p1_evasalgado;
import java.util.Scanner; 
import java.util.Random; 

public class Duplicados {
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random(); 
    
    private int[][] globales; 
    
    public void opcion2 (){
        System.out.println("Ingrese un tamaño: ");
        int tam = leer.nextInt(); 
        int [] num = new int[tam];
        
        num = llenado(tam);
        System.out.println("Arreglo generado: "+imprimirarray(num));
        System.out.print("Arreglo sin duplicados: ");
        SDuplicados(num); 
    } 
    
    public int[] llenado (int tam){
        int [] temp = new int[tam];
        for(int i=0;i<tam;i++){
            temp[i] = rand.nextInt(10);
        } return temp;
    } 
    
    public String imprimirarray (int[] arreglo){
        String acumarray = " "; 
       for(int i=0;i<arreglo.length;i++){
            acumarray += "["+arreglo[i]+"]";
        } System.out.println();
        return acumarray; 
    }
    public void SDuplicados (int [] arreglo){
        int contador = 0;
        int temp[] = new int [arreglo.length];
        for(int i=0;i<arreglo.length-1;i++){
            if(arreglo[i]==arreglo[i+1]){
                arreglo[i] = 0;
            }
            System.out.print("["+arreglo[i]+"]");
        } 
        System.out.println();
    } 
   
}
